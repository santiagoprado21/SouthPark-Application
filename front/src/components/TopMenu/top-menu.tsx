import Menu from "@/components/icons/Menu";
import Image from "next/image";
import React from "react";

export default function TopMenu() {
  return (
    <div className="flex bg-yellow-400 h-20 justify-between flex items-center px-6">
      <div className="flex items-center">
        <Menu />
      </div>
      <div>
        <h2 className="font-semibold text-sky-800 font-serif text-4xl mr-4">
          Programacion hoy
        </h2>
      </div>
      <div className="">
        <Image
          src="/images/south-park.png"
          width={70}
          height={70}
          alt="Logo image"
        />
      </div>
    </div>
  );
}
