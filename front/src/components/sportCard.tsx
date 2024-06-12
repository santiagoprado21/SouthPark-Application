import React from 'react';

interface SportCardProps {
  title: string;
  image: string;
  description: string;
}

const SportCard: React.FC<SportCardProps> = ({ title, image, description }) => {
  return (
    <div className="max-w-sm rounded overflow-hidden shadow-lg m-4">
      <img className="w-full" src={image} alt={title} />
      <div className="px-6 py-4">
        <div className="font-bold text-xl mb-2">{title}</div>
        <p className="text-gray-700 text-base">
          {description}
        </p>
      </div>
    </div>
  );
};

export default SportCard;