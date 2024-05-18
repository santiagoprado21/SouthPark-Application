import React, { useState } from "react";
import MenuIcon from "@/components/icons/menu-icon";
import HomeIcon from "@/components/icons/home-icon";
import SportsIcon from "@/components/icons/sports-icon";
import ContactIcon from "@/components/icons/contact-icon";
import BookingIcon from "@/components/icons/booking-icon";
import { useRouter } from "next/navigation";

const Drawer = () => {
  const router = useRouter();
  const [isOpen, setIsOpen] = useState(false);

  const toggleDrawer = () => {
    setIsOpen(!isOpen);
  };

  function handleClickHome() {
    router.push("/");
  }

  function handleClickBooking() {
    router.push("/booking");
  }

  return (
    <div>
      <div onClick={toggleDrawer} className="cursor-pointer">
        <MenuIcon />
      </div>
      <div
        className={`fixed top-0 left-0 h-full w-64 bg-sky-800 text-white  transform ${
          isOpen ? "translate-x-0" : "-translate-x-full"
        } transition-transform duration-300 ease-in-out z-40`}
      >
        <div className="p-4">
          <button onClick={toggleDrawer} className="text-white text-2xl ">
            &times;
          </button>
          <ul className="mt-2 pt-40 ">
            <div className="cursor-pointer">
              <div
                onClick={handleClickHome}
                className="mb-4 flex items-center "
              >
                <HomeIcon />
                <li className="text-center">Inicio</li>
              </div>
              <div
                onClick={handleClickBooking}
                className="mb-4 flex items-center"
              >
                <BookingIcon />
                <li className="text-center">Reservas</li>
              </div>
              <div className="mb-4 flex items-center">
                <SportsIcon />
                <li className="text-center">Deportes</li>
              </div>
              <div className="flex items-center">
                <ContactIcon />
                <li className="text-center">Contacto</li>
              </div>
            </div>
          </ul>
        </div>
      </div>
    </div>
  );
};

export default Drawer;
