"use client";
import React, { useState } from "react";

export default function Carousel() {
  const photos = ["/images/futbol.png", "/images/mini-golf.png"];

  const [currentIndex, setCurrentIndex] = useState(0);

  const prevPhoto = () => {
    const index = currentIndex === 0 ? photos.length - 1 : currentIndex - 1;
    setCurrentIndex(index);
  };

  const nextPhoto = () => {
    const index = currentIndex === photos.length - 1 ? 0 : currentIndex + 1;
    setCurrentIndex(index);
  };

  return (
    <div className="relative w-full max-w-3xl mx-auto pl-5 pr-5">
      <div className="relative w-full h-64 flex">
        <div className="relative w-full h-full">
          <img
            src={photos[currentIndex]}
            alt={`Photo ${currentIndex + 1}`}
            className="object-cover h-full rounded-lg"
          />
        </div>
        <button
          onClick={prevPhoto}
          className="absolute top-1/2 left-0 transform -translate-y-1/2 p-2 bg-gray-800 text-white rounded-full"
        >
          &lt;
        </button>
        <button
          onClick={nextPhoto}
          className="absolute top-1/2 right-0 transform -translate-y-1/2 p-2 bg-gray-800 text-white rounded-full"
        >
          &gt;
        </button>
      </div>
    </div>
  );
}
