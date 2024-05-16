"use client";
import Image from "next/image";
import { usePathname, useRouter } from "next/navigation";
import React from "react";
import Drawer from "@/components/Drawer/drawer";
export default function TopMenu() {
  const pathName = usePathname();

  const pageTitleDict = {
    "/": "South Park",
    "/booking": "Programacion Hoy",
  };

  const pageTitle =
    pageTitleDict[pathName as keyof typeof pageTitleDict] ?? "South Park";

  return (
    <div className="flex bg-yellow-400 h-20 justify-between flex items-center px-6">
      <div className="flex items-center">
        <Drawer />
      </div>
      <div>
        <h2 className="font-semibold text-sky-800 font-serif text-4xl mr-4">
          {pageTitle}
        </h2>
        <div></div>
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
