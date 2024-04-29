// pages/_app.js
import React from 'react';
import { Auth0Provider } from '@auth0/auth0-react';

const domain = process.env.NEXT_PUBLIC_AUTH0_DOMAIN;
const clientId = process.env.NEXT_PUBLIC_AUTH0_CLIENT_ID;

function MyApp({ Component, pageProps }) {
  return (
    <Auth0Provider
      domain={domain}
      clientId={clientId}
      redirectUri={typeof window !== 'undefined' ? window.location.origin : null}
    >
      <Component {...pageProps} />
    </Auth0Provider>
  );
}

export default MyApp;