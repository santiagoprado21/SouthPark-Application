import React from "react";

export default function VoleyPage() {
  const images = [
    { src: "/images/escuelaVoley.png", title: "Escuelas" },
    { src: "/images/canchasVoley.png", title: "Canchas" },
    { src: "/images/torneoVoley.png", title: "Torneo" },
    { src: "/images/fotoDestacadaVoley.png", title: "Fotos Destacadas" },
  ];

  return (
    <div className="min-h-screen flex flex-col font-serif">
      <header className="text-center my-8">
        <h1 className="text-2xl font-ligth">
        "La arena es nuestra pista, el voley playa nuestra pasión. ¡Únete a la aventura!"
        </h1>
      </header>
      <main className="flex flex-grow items-start">
        <section className="w-1/2 p-10">
          <div className="text-lg pl-10 pt-10">
            <p className="mb-4">
              El voleibol playa es un deporte apasionante y divertido que se juega en la arena. Se caracteriza por sus movimientos ágiles y la estrategia en equipo. En nuestro club, ofrecemos instalaciones de primer nivel para que disfrutes de este deporte al máximo.
            </p>
            <p className="mb-4">
              Ya seas un principiante o un jugador experimentado, nuestras canchas están disponibles para ti. Ven y vive la experiencia del voleibol playa con nosotros.
            </p>
            <p>
              Además, organizamos torneos y eventos regularmente para que puedas demostrar tus habilidades y conocer a otros aficionados del voleibol playa.
            </p>
          </div>
        </section>
        <section className="w-1/2 p-10 flex flex-wrap justify-center items-start">
          {images.map((image, index) => (
            <div key={index} className="w-48 m-4 flex flex-col items-center">
              <p className="text-center font-semibold mb-2 truncate w-48">{image.title}</p>
              <div className="w-full h-48 bg-gray-200 rounded-lg overflow-hidden">
                <img
                  src={image.src}
                  alt={image.title}
                  className="w-full h-full object-cover rounded-lg"
                />
              </div>
            </div>
          ))}
        </section>
      </main>
    </div>
  );
}
