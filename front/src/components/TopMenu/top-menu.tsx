import React from "react";

export default function TopMenu() {
  return (
    <div className="bg-yellow-400 h-20 flex justify-between items-center">
      <div className="flex items-center">
        <svg
          xmlns="http://www.w3.org/2000/svg"
          viewBox="0 0 448 512"
          className="h-10 w-10 ml-4 p1"
        >
          <path
            d="M0 96C0 78.3 14.3 64 32 64H416c17.7 0 32 14.3 32 
        32s-14.3 32-32 32H32C14.3 128 0 113.7 0 96zM0 256c0-17.7 14.3-32 32-32H416c17.7 0 32 14.3 32 32s-14.3 32-32 32H32c-17.7 0-32-14.3-32-32zM448 416c0 17.7-14.3 32-32 32H32c-17.7 0-32-14.3-32-32s14.3-32 32-32H416c17.7 0 32 14.3 32 32z"
          />
        </svg>
      </div>
      <div> 
        <h2 className="text-lg font-semibold text-sky-800 font-serif text-3xl mr-4">
          Programacion hoy
        </h2>
      </div>
      <div></div>
    </div>
  );
}

