import React from 'react';

type RowData = {
  data: {
    status: string;
  };
};

export const StatusColumn: React.FC<{ rowData: RowData }> = ({ rowData }) => {
  const { status } = rowData.data;
  const statusStyle = {
    color: status === 'confirmado' ? 'green' : 'inherit',
  };

  return <span style={statusStyle}>{status}</span>;
};