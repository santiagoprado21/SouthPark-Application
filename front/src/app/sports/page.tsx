import React from 'react';
import SportCard from "@/components/sportCard";

const sports = [
  {
    title: 'Fútbol',
    image: '/images/canchaFutbol.png',
    description: 'El deporte rey, jugado en todo el mundo. Únete a nuestras ligas y disfruta del fútbol.'
  },
  {
    title: 'Vóley Playa',
    image: '/images/canchasVoley.png',
    description: 'Disfruta del vóley en la arena con amigos y familiares. Alquila una cancha de vóley playa hoy mismo.'
  },
  {
    title: 'Fútbol Sintético',
    image: '/images/canchasSinteticas.png',
    description: 'Ideal para jugar en superficies artificiales. Perfecto para entrenamientos y partidos recreativos.'
  },
  {
    title: 'Mini Golf',
    image: '/images/mini-golf.png',
    description: 'Diversión para todas las edades en nuestros campos de mini golf. Ven y demuestra tus habilidades.'
  },
  {
    title: 'Tenis',
    image: '/images/tenis.png',
    description: 'Practica tu saque y revés en nuestras canchas de tenis. Reserva tu cancha y empieza a jugar.'
  }
];

const SportPage: React.FC = () => {
  return (
    <div className="container mx-auto px-4 font-serif">
      <h1 className="text-4xl font-light text-center my-8">"Deportes en un mismo lugar"</h1>
      <div className="flex flex-wrap justify-center">
        {sports.map((sport, index) => (
          <SportCard
            key={index}
            title={sport.title}
            image={sport.image}
            description={sport.description}
          />
        ))}
      </div>
    </div>
  );
};

export default SportPage;
