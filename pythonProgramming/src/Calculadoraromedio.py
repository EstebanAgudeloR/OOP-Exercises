import tkinter as tk
from tkinter import messagebox
import statistics

def calcular():
    try:
        notas = []
        for e in entries:
            val = e.get().strip()
            if val == "":
                raise ValueError("Todas las notas deben estar completas.")
            notas.append(float(val))
        promedio = statistics.mean(notas)
        desviacion = statistics.pstdev(notas)  # desviación estándar poblacional
        promedio_var.set(f"{promedio:.2f}")
        desviacion_var.set(f"{desviacion:.2f}")
    except ValueError as err:
        messagebox.showerror("Error", f"Entrada inválida: {err}")

def limpiar():
    for e in entries:
        e.delete(0, tk.END)
    promedio_var.set("")
    desviacion_var.set("")
    entries[0].focus_set()

root = tk.Tk()
root.title("Notas - Promedio y Desviación")
root.resizable(False, False)
padx = 10
pady = 5

tk.Label(root, text="Ingrese 5 notas:").grid(row=0, column=0, columnspan=2, padx=padx, pady=(pady, 0))

entries = []
for i in range(5):
    tk.Label(root, text=f"Nota {i+1}:").grid(row=1+i, column=0, sticky="e", padx=padx, pady=2)
    e = tk.Entry(root, width=10)
    e.grid(row=1+i, column=1, padx=padx, pady=2)
    entries.append(e)

btn_frame = tk.Frame(root)
btn_frame.grid(row=6, column=0, columnspan=2, pady=(pady, 0))

calcular_btn = tk.Button(btn_frame, text="Calcular", width=10, command=calcular)
calcular_btn.pack(side="left", padx=5)
limpiar_btn = tk.Button(btn_frame, text="Limpiar", width=10, command=limpiar)
limpiar_btn.pack(side="left", padx=5)

promedio_var = tk.StringVar()
desviacion_var = tk.StringVar()

tk.Label(root, text="Promedio:").grid(row=7, column=0, sticky="e", padx=padx, pady=4)
tk.Label(root, textvariable=promedio_var, width=12, anchor="w").grid(row=7, column=1, padx=padx, pady=4)

tk.Label(root, text="Desviación estándar:").grid(row=8, column=0, sticky="e", padx=padx, pady=4)
tk.Label(root, textvariable=desviacion_var, width=12, anchor="w").grid(row=8, column=1, padx=padx, pady=4)

entries[0].focus_set()
root.mainloop()