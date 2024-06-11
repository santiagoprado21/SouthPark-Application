"use client"
import React, { useRef } from "react";
import emailjs from "emailjs-com";

export default function ContactPage() {
  const form = useRef<HTMLFormElement>(null);

  const sendEmail = (e: React.FormEvent<HTMLFormElement>) => {
    e.preventDefault();

    if (form.current) {
      emailjs.sendForm('service_nbmrpjp', 'template_x26tykw', form.current, 'BRm7Qj53t-MVQuWCb')
        .then((result) => {
            console.log(result.text);
            alert("Mensaje enviado correctamente");
        }, (error) => {
            console.log(error.text);
            alert("Hubo un error al enviar el mensaje");
        });
    } else {
      console.error("Formulario no encontrado.");
    }
  };

  return (
    <div className="min-h-screen flex flex-col font-serif">
      <header className="text-center my-8">
        <h1 className="text-2xl font-light">
          "Contáctanos y estaremos encantados de ayudarte"
        </h1>
      </header>
      <main className="flex flex-grow items-start">
        <section className="w-1/2 p-10">
          <form ref={form} onSubmit={sendEmail} className="space-y-6">
            <div>
              <label htmlFor="name" className="block text-lg font-medium text-gray-700">
                Nombre
              </label>
              <input
                type="text"
                id="name"
                name="name"
                className="mt-1 block w-full p-2 border border-gray-300 rounded-md shadow-sm focus:ring-blue-500 focus:border-blue-500"
                required
              />
            </div>
            <div>
              <label htmlFor="email" className="block text-lg font-medium text-gray-700">
                Email
              </label>
              <input
                type="email"
                id="email"
                name="email"
                className="mt-1 block w-full p-2 border border-gray-300 rounded-md shadow-sm focus:ring-blue-500 focus:border-blue-500"
                required
              />
            </div>
            <div>
              <label htmlFor="message" className="block text-lg font-medium text-gray-700">
                Mensaje
              </label>
              <textarea
                id="message"
                name="message"
                className="mt-1 block w-full p-2 border border-gray-300 rounded-md shadow-sm focus:ring-blue-500 focus:border-blue-500"
                required
              ></textarea>
            </div>
            <div>
              <button
                type="submit"
                className="w-full py-2 px-4 border border-transparent rounded-md shadow-sm text-lg font-medium text-white bg-blue-600 hover:bg-blue-700 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-blue-500"
              >
                Enviar
              </button>
            </div>
          </form>
        </section>
        <section className="w-1/2 p-10 flex justify-center items-center">
          <div className="w-full h-full bg-gray-200 rounded-lg overflow-hidden">
            <img
              src="/images/contact_image.png" // Asegúrate de reemplazar con la ruta correcta de tu imagen
              alt="Contáctanos"
              className="w-full h-full object-cover rounded-lg"
            />
          </div>
        </section>
      </main>
    </div>
  );
}
