"use client";
import Carousel from "@/components/Home/carousel";
import { useRouter } from "next/navigation";
import { useEffect, useState } from 'react';
import userService from '@/services/user_service';
import { User } from '@/models/User';

const sports = [
  {
    name: "Voleibol Playa",
    imageUrl: "/images/voley-playa.png",
    route: "/voley",
  },
  {
    name: "Tenis",
    imageUrl: "/images/tenis.png",
    route: "/tenis"
  },
  {
    name: "Futbol Sintetico",
    imageUrl: "/images/futbol-sintetico.png",
    route: "/futbol-sintetico"
  },
  {
    name: "Futbol",
    imageUrl: "/images/futbol.png",
    route: "/futbol"
  },
  {
    name: "Mini Golf",
    imageUrl: "/images/mini-golf.png",
    route: "/mini-golf"
  },
];

export default function Page() {

  const [user, setUser] = useState<User | null>(null);

  useEffect(() => {
    const userData = JSON.parse(localStorage.getItem('userData') || '{}');
    const { username } = userData;

    const fetchUserData = async () => {
      try {
        const userData = await userService.getUserByUsername(username);
        setUser(userData);
        console.log(userData);
      } catch (error) {
        console.error('Error al obtener los datos del usuario:', error);
      }
    };

    fetchUserData();
  }, []);


  const router = useRouter();

  return (
    <main className="min-h-screen flex flex-col">
      <section className="flex-grow flex items-center justify-center">
        <div className="w-1/2 flex justify-center items-center pl-10">
          <Carousel />
        </div>
        <div className="w-1/2 flex flex-col items-center justify-center">
          <h1 className="font-semibold text-sky-800 font-serif text-4xl text-center pr-10">
            Bienvenidos a nuestro Club
          </h1>
          <p className="text-center font-light font-serif text-2xl pt-5">
            5 deportes en un mismo lugar
          </p>
        </div>
      </section>

      <section className="flex-grow flex flex-col items-center justify-center">
        <h2 className="text-4xl font-semibold text-sky-800 font-serif">
          Nuestros Deportes
        </h2>
        <div className="flex flex-wrap justify-center mt-5">
          {sports.map((sport, index) => (
            <div key={index} className="flex flex-col items-center">
              <div
                className="w-24 h-24 bg-gray-200 rounded-full m-10 overflow-hidden cursor-pointer"
                onClick={() => {
                  if (sport.route) {
                    router.push(sport.route);
                  }
                }}
              >
                <img
                  src={sport.imageUrl}
                  alt={sport.name}
                  className="w-full h-full object-cover"
                  onClick={() => {
                    if (sport.route) {
                      router.push(sport.route);
                    }
                  }}
                />
              </div>
              <p className="text-center font-semibold">{sport.name}</p>
            </div>
          ))}
        </div>
      </section>
    </main>
  );
}
