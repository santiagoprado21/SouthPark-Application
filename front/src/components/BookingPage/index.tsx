"use client";
import 'primereact/resources/themes/saga-blue/theme.css';
import 'primereact/resources/primereact.min.css';
import 'primeicons/primeicons.css';
import BookingDataTable from './BookingDataTable';
import { Panel } from 'primereact/panel';
import { Menubar } from 'primereact/menubar';
import React, { useState, useRef } from 'react';
import BookingDialog from './BookingDialog';

const BookingPage = () => {
  const [items] = useState([
    { label: 'New', icon: 'pi pi-fw pi-plus', command: () => { showDialog(); } },
    { label: 'Edit', icon: 'pi pi-fw pi-pencil', command: () => { alert('Edited!'); } },
    { label: 'Delete', icon: 'pi pi-fw pi-trash', command: () => { alert('Deleted!'); } }
  ]);

  const [displayDialog, setDisplayDialog] = useState(false);
  const dialogRef = useRef<any>(null);

  const showDialog = () => {
    if (dialogRef.current) {
      dialogRef.current.resetForm();
    }
    setDisplayDialog(true);
  }

  const hideDialog = () => {
    setDisplayDialog(false);
  }

  return (
    <Panel header="" style={{ width: '80%', marginTop: '20px', margin: '0 auto' }}>
      <Menubar model={items} />
      <br></br>
      <BookingDataTable />
      <BookingDialog ref={dialogRef} visible={displayDialog} onHide={hideDialog} />
      {/* Otros componentes o lógica de la página */}
    </Panel>
  );
};

export default BookingPage;
