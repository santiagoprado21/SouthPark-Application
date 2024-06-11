"use client";
import Image from "next/image";
import { usePathname, useRouter } from "next/navigation";
import React from "react";
import Drawer from "@/components/Drawer/drawer";
export default function TopMenu() {
  const pathName = usePathname();
  const pageTitleDict = {
    "/": "South Park",
    "/booking": "Realizar Reservas",
    "/voley" : "Voley Playa",
    "/mini-golf" : "Mini Golf",
    "/futbol" : "Futbol",
    "/futbol-sintetico" : "Futbol Sintetico",
    "/tenis" : "Tenis",
    "/contact" : "Contacto"
  };

  const pageTitle =
    pageTitleDict[pathName as keyof typeof pageTitleDict] ?? "South Park";

  return (
    <div className="flex bg-yellow-400 h-32 justify-between flex items-center px-6">
      <div className="flex items-center">
        <Drawer />
      </div>
      <div>
        <h2 className="font-semibold text-sky-800 font-serif text-5xl mr-4">
          {pageTitle}
        </h2>
        <div className="font-serif">
        {/* <p>Vive el deporte en su maxima expresion</p> */}
        </div>
      </div>
      <div className="">
        <Image
          src="/images/south-park.png"
          width={80}
          height={80}
          alt="Logo image"
        />
      </div>
    </div>
  );
}
