/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mainapplication;

/**
 *
 * @author ASUS
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainApplication extends javax.swing.JFrame {
    private JButton btnBangunRuang, btnPembayaran, btnZakatMal;
    /**
     * Creates new form MainApplication
     */
    public MainApplication() {
        setTitle("Aplikasi Utama");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblTitle = new JLabel("Pilih Aplikasi Yang Akan Anda Gunakan!", JLabel.CENTER);
        lblTitle.setBounds(50, 30, 300, 30);
        add(lblTitle);

        btnBangunRuang = new JButton("Kalkulator Bangun Ruang");
        btnBangunRuang.setBounds(100, 80, 200, 30);
        add(btnBangunRuang);

        btnPembayaran = new JButton("Aplikasi Pembayaran");
        btnPembayaran.setBounds(100, 130, 200, 30);
        add(btnPembayaran);

        btnZakatMal = new JButton("Kalkulator Zakat Mal");
        btnZakatMal.setBounds(100, 180, 200, 30);
        add(btnZakatMal);

        // Tambahkan aksi tombol
        btnBangunRuang.addActionListener(e -> new BangunRuangCalculator().setVisible(true));
        btnPembayaran.addActionListener(e -> new AplikasiPembayaran().setVisible(true));
        btnZakatMal.addActionListener(e -> new ZakatMalCalculator().setVisible(true));
    }
public class BangunRuangCalculator extends JFrame {
    // Komponen GUI
    private JLabel lblTitle, lblBalok, lblKubus, lblBola, lblKerucut, lblPrisma;
    private JTextField txtPanjang, txtLebar, txtTinggiBalok, txtSisiKubus;
    private JTextField txtJariBola, txtJariKerucut, txtTinggiKerucut, txtAlasPrisma, txtTinggiPrisma;
    private JButton btnHitung;
    private JTextArea txtHasil;

    public BangunRuangCalculator() {
        // Frame Settings
        setTitle("Kalkulator Luas & Keliling Bangun Ruang");
        setSize(500, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set background color to red
        getContentPane().setBackground(new Color(255, 0, 0)); // Red background

        // Title
        lblTitle = new JLabel("Kalkulator Luas & Keliling Bangun Ruang");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 16));  // Font customization
        lblTitle.setForeground(Color.WHITE);  // White font color
        lblTitle.setBounds(100, 10, 300, 25);
        add(lblTitle);

        // Input untuk Balok
        lblBalok = new JLabel("Balok (Panjang, Lebar, Tinggi):");
        lblBalok.setFont(new Font("Arial", Font.PLAIN, 12));  // Font customization
        lblBalok.setForeground(Color.WHITE);  // White font color
        lblBalok.setBounds(10, 50, 200, 20);
        add(lblBalok);

        txtPanjang = new JTextField();
        txtPanjang.setBounds(220, 50, 70, 25);
        add(txtPanjang);

        txtLebar = new JTextField();
        txtLebar.setBounds(300, 50, 70, 25);
        add(txtLebar);

        txtTinggiBalok = new JTextField();
        txtTinggiBalok.setBounds(380, 50, 70, 25);
        add(txtTinggiBalok);

        // Input untuk Kubus
        lblKubus = new JLabel("Kubus (Sisi):");
        lblKubus.setFont(new Font("Arial", Font.PLAIN, 12));  // Font customization
        lblKubus.setForeground(Color.WHITE);  // White font color
        lblKubus.setBounds(10, 80, 200, 20);
        add(lblKubus);

        txtSisiKubus = new JTextField();
        txtSisiKubus.setBounds(220, 80, 70, 25);
        add(txtSisiKubus);

        // Input untuk Bola
        lblBola = new JLabel("Bola (Jari-jari):");
        lblBola.setFont(new Font("Arial", Font.PLAIN, 12));  // Font customization
        lblBola.setForeground(Color.WHITE);  // White font color
        lblBola.setBounds(10, 110, 200, 20);
        add(lblBola);

        txtJariBola = new JTextField();
        txtJariBola.setBounds(220, 110, 70, 25);
        add(txtJariBola);

        // Input untuk Kerucut
        lblKerucut = new JLabel("Kerucut (Jari-jari, Tinggi):");
        lblKerucut.setFont(new Font("Arial", Font.PLAIN, 12));  // Font customization
        lblKerucut.setForeground(Color.WHITE);  // White font color
        lblKerucut.setBounds(10, 140, 200, 20);
        add(lblKerucut);

        txtJariKerucut = new JTextField();
        txtJariKerucut.setBounds(220, 140, 70, 25);
        add(txtJariKerucut);

        txtTinggiKerucut = new JTextField();
        txtTinggiKerucut.setBounds(300, 140, 70, 25);
        add(txtTinggiKerucut);

        // Input untuk Prisma Segitiga
        lblPrisma = new JLabel("Prisma (Alas, Tinggi):");
        lblPrisma.setFont(new Font("Arial", Font.PLAIN, 12));  // Font customization
        lblPrisma.setForeground(Color.WHITE);  // White font color
        lblPrisma.setBounds(10, 170, 200, 20);
        add(lblPrisma);

        txtAlasPrisma = new JTextField();
        txtAlasPrisma.setBounds(220, 170, 70, 25);
        add(txtAlasPrisma);

        txtTinggiPrisma = new JTextField();
        txtTinggiPrisma.setBounds(300, 170, 70, 25);
        add(txtTinggiPrisma);

        // Tombol Hitung
        btnHitung = new JButton("Hitung");
        btnHitung.setBounds(200, 220, 100, 30);
        btnHitung.setBackground(new Color(0, 0, 0));  // Black background for the button
        btnHitung.setForeground(new Color(255, 255, 255));  // White text color for the button
        add(btnHitung);

        // TextArea untuk hasil
        txtHasil = new JTextArea();
        txtHasil.setBounds(10, 270, 460, 250);
        txtHasil.setEditable(false);
        txtHasil.setBackground(new Color(240, 240, 240));  // Light grey background for the results
        txtHasil.setForeground(new Color(0, 0, 0));    // Black text color for the results
        add(txtHasil);

        // Event Handling
        btnHitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hitungLuasKeliling();
            }
        });

        setVisible(true);
    }

    private void hitungLuasKeliling() {
        // Variabel hasil
        StringBuilder hasil = new StringBuilder();

        // Balok
        try {
            double panjang = Double.parseDouble(txtPanjang.getText());
            double lebar = Double.parseDouble(txtLebar.getText());
            double tinggi = Double.parseDouble(txtTinggiBalok.getText());
            double luas = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
            double keliling = 4 * (panjang + lebar + tinggi);
            hasil.append("Balok - Luas: ").append(luas).append(", Keliling: ").append(keliling).append("\n");
        } catch (NumberFormatException ex) {
            hasil.append("Input Balok tidak valid.\n");
        }

        // Kubus
        try {
            double sisi = Double.parseDouble(txtSisiKubus.getText());
            double luas = 6 * sisi * sisi;
            double keliling = 12 * sisi;
            hasil.append("Kubus - Luas: ").append(luas).append(", Keliling: ").append(keliling).append("\n");
        } catch (NumberFormatException ex) {
            hasil.append("Input Kubus tidak valid.\n");
        }

        // Bola
        try {
            double jari = Double.parseDouble(txtJariBola.getText());
            double luas = 4 * Math.PI * jari * jari;
            double keliling = 2 * Math.PI * jari;  // Keliling lingkaran besar (lingkaran bola)
            hasil.append("Bola - Luas: ").append(luas).append(", Keliling: ").append(keliling).append("\n");
        } catch (NumberFormatException ex) {
            hasil.append("Input Bola tidak valid.\n");
        }

        // Kerucut
        try {
            double jari = Double.parseDouble(txtJariKerucut.getText());
            double tinggi = Double.parseDouble(txtTinggiKerucut.getText());
            double s = Math.sqrt(jari * jari + tinggi * tinggi);  // Garis pelukis kerucut
            double luas = Math.PI * jari * (jari + s);  // Luas permukaan kerucut
            double keliling = 2 * Math.PI * jari;  // Keliling alas kerucut
            hasil.append("Kerucut - Luas: ").append(luas).append(", Keliling: ").append(keliling).append("\n");
        } catch (NumberFormatException ex) {
            hasil.append("Input Kerucut tidak valid.\n");
        }

        // Prisma Segitiga
        try {
            double alas = Double.parseDouble(txtAlasPrisma.getText());
            double tinggi = Double.parseDouble(txtTinggiPrisma.getText());
            double keliling = 3 * alas + 3 * tinggi;  // Asumsi sisi prisma segitiga sama panjang
            double luas = alas * tinggi;  // Luas alas segitiga
            hasil.append("Prisma Segitiga - Luas: ").append(luas).append(", Keliling: ").append(keliling).append("\n");
        } catch (NumberFormatException ex) {
            hasil.append("Input Prisma Segitiga tidak valid.\n");
        }

        // Menampilkan hasil
        txtHasil.setText(hasil.toString());
    }

    public static void main(String[] args) {
        /*bangunRuangCalculator*/
    }
}

public class AplikasiPembayaran extends JFrame {
    private JTextField txtTotalBelanja, txtNominalBayar, txtKembalian;
    private JComboBox<String> cbMetodePembayaran;
    private JButton btnHitung, btnReset;

    public AplikasiPembayaran() {
        // Pengaturan JFrame
        setTitle("Aplikasi Pembayaran");
        setSize(500, 400); // Perbesar ukuran JFrame
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Warna utama
        Color warnaUtama = new Color(41, 128, 185); // Biru
        Color warnaSekunder = new Color(236, 240, 241); // Putih keabu-abuan
        Color warnaTombol = new Color(39, 174, 96); // Hijau
        Color warnaTombolReset = new Color(231, 76, 60); // Merah

        // Panel latar belakang
        JPanel panel = new JPanel();
        panel.setBackground(warnaSekunder);
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Font besar untuk teks dan tombol
        Font fontLabel = new Font("Arial", Font.BOLD, 16);
        Font fontInput = new Font("Arial", Font.PLAIN, 18);
        Font fontTombol = new Font("Arial", Font.BOLD, 16);

        // Komponen GUI
        JLabel lblTotalBelanja = new JLabel("Total Belanja (Rp):");
        lblTotalBelanja.setFont(fontLabel);
        lblTotalBelanja.setForeground(warnaUtama);
        txtTotalBelanja = new JTextField(15);
        txtTotalBelanja.setFont(fontInput);

        JLabel lblMetodePembayaran = new JLabel("Metode Pembayaran:");
        lblMetodePembayaran.setFont(fontLabel);
        lblMetodePembayaran.setForeground(warnaUtama);
        cbMetodePembayaran = new JComboBox<>(new String[]{"Tunai", "Debit", "Kredit"});
        cbMetodePembayaran.setFont(fontInput);

        JLabel lblNominalBayar = new JLabel("Nominal Bayar (Rp):");
        lblNominalBayar.setFont(fontLabel);
        lblNominalBayar.setForeground(warnaUtama);
        txtNominalBayar = new JTextField(15);
        txtNominalBayar.setFont(fontInput);

        JLabel lblKembalian = new JLabel("Kembalian (Rp):");
        lblKembalian.setFont(fontLabel);
        lblKembalian.setForeground(warnaUtama);
        txtKembalian = new JTextField(15);
        txtKembalian.setFont(fontInput);
        txtKembalian.setEditable(false);

        btnHitung = new JButton("Hitung");
        btnHitung.setFont(fontTombol);
        btnHitung.setBackground(warnaTombol);
        btnHitung.setForeground(Color.WHITE);

        btnReset = new JButton("Reset");
        btnReset.setFont(fontTombol);
        btnReset.setBackground(warnaTombolReset);
        btnReset.setForeground(Color.WHITE);

        // Tambahkan komponen ke panel menggunakan GridBagLayout
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(lblTotalBelanja, gbc);

        gbc.gridx = 1;
        panel.add(txtTotalBelanja, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(lblMetodePembayaran, gbc);

        gbc.gridx = 1;
        panel.add(cbMetodePembayaran, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(lblNominalBayar, gbc);

        gbc.gridx = 1;
        panel.add(txtNominalBayar, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(lblKembalian, gbc);

        gbc.gridx = 1;
        panel.add(txtKembalian, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        panel.add(btnHitung, gbc);

        gbc.gridx = 1;
        panel.add(btnReset, gbc);

        // Tambahkan panel ke frame
        add(panel, BorderLayout.CENTER);

        // Event Listener
        btnHitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hitungPembayaran();
            }
        });

        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetForm();
            }
        });

        setVisible(true);
    }

    private void hitungPembayaran() {
        try {
            double totalBelanja = Double.parseDouble(txtTotalBelanja.getText());
            String metode = (String) cbMetodePembayaran.getSelectedItem();

            if (metode.equals("Tunai")) {
                double nominalBayar = Double.parseDouble(txtNominalBayar.getText());
                if (nominalBayar >= totalBelanja) {
                    double kembalian = nominalBayar - totalBelanja;
                    txtKembalian.setText(String.format("%.2f", kembalian));
                    JOptionPane.showMessageDialog(this, "Pembayaran Tunai Berhasil!");
                } else {
                    JOptionPane.showMessageDialog(this, "Uang Anda kurang!");
                }
            } else {
                txtKembalian.setText("0.00");
                JOptionPane.showMessageDialog(this, "Pembayaran " + metode + " Berhasil!");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Input tidak valid! Silakan masukkan angka.");
        }
    }

    private void resetForm() {
        txtTotalBelanja.setText("");
        txtNominalBayar.setText("");
        txtKembalian.setText("");
        cbMetodePembayaran.setSelectedIndex(0);
    }

    public static void main(String[] args) {
        // Jalankan aplikasi di Event Dispatch Thread
        //SwingUtilities.invokeLater(() -> new AplikasiPembayaran());
    }
}

public class ZakatMalCalculator extends JFrame {
    // Komponen GUI
    private JLabel lblTitle, lblTotalHarta, lblInfoNisab, lblHasil;
    private JTextField txtTotalHarta;
    private JButton btnHitung, btnReset;
    private JTextArea txtHasil;

    public ZakatMalCalculator() {
        // Pengaturan dasar JFrame
        setTitle("Aplikasi Perhitungan Zakat Mal");
        setSize(450, 400); // Ukuran frame lebih kecil
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Menggunakan layout null untuk kontrol manual
        getContentPane().setBackground(new Color(105, 105, 105)); // Background abu tua

        // Label judul
        lblTitle = new JLabel("Aplikasi Perhitungan Zakat Mal", JLabel.CENTER);
        lblTitle.setBounds(10, 10, 420, 30);
        lblTitle.setFont(new Font("Verdana", Font.BOLD, 18));
        lblTitle.setForeground(Color.WHITE); // Warna teks hitam
        add(lblTitle);

        // Label dan TextField Total Harta
        lblTotalHarta = new JLabel("Masukkan Total Harta (Rp):");
        lblTotalHarta.setBounds(20, 60, 200, 25);
        lblTotalHarta.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        lblTotalHarta.setForeground(Color.WHITE);
        add(lblTotalHarta);

        txtTotalHarta = new JTextField();
        txtTotalHarta.setBounds(230, 60, 180, 25);
        txtTotalHarta.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        add(txtTotalHarta);

        // Informasi Nisab
        lblInfoNisab = new JLabel("Nisab: 85 gram emas (setara Rp 85.000.000)");
        lblInfoNisab.setBounds(20, 100, 400, 20);
        lblInfoNisab.setFont(new Font("Segoe UI", Font.ITALIC, 12));
        lblInfoNisab.setForeground(new Color(169, 169, 169)); // Abu-abu muda
        add(lblInfoNisab);

        // Label hasil perhitungan
        lblHasil = new JLabel("Hasil Perhitungan:");
        lblHasil.setBounds(20, 140, 200, 20);
        lblHasil.setFont(new Font("Segoe UI", Font.BOLD, 14));
        lblHasil.setForeground(Color.WHITE);
        add(lblHasil);

        // Area hasil
        txtHasil = new JTextArea();
        txtHasil.setBounds(20, 170, 390, 100);
        txtHasil.setEditable(false);
        txtHasil.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        txtHasil.setBackground(Color.WHITE);
        txtHasil.setForeground(Color.BLACK);
        txtHasil.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(txtHasil);

        // Tombol Hitung
        btnHitung = new JButton("Hitung");
        btnHitung.setBounds(100, 290, 100, 30);
        btnHitung.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnHitung.setBackground(new Color(50, 205, 50)); // Hijau
        btnHitung.setForeground(Color.WHITE);
        add(btnHitung);

        // Tombol Reset
        btnReset = new JButton("Reset");
        btnReset.setBounds(250, 290, 100, 30);
        btnReset.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnReset.setBackground(new Color(220, 20, 60)); // Merah
        btnReset.setForeground(Color.WHITE);
        add(btnReset);

        // Event tombol hitung
        btnHitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double totalHarta = Double.parseDouble(txtTotalHarta.getText());
                    double nisab = 85000000; // Nisab setara 85 gram emas

                    // Perhitungan zakat
                    if (totalHarta >= nisab) {
                        double zakat = totalHarta * 0.025;
                        txtHasil.setText("Harta Anda wajib zakat.\n" +
                                "Total Zakat Mal yang harus dibayarkan: Rp " + String.format("%,.2f", zakat));
                    } else {
                        txtHasil.setText("Harta Anda belum mencapai nisab.\n" +
                                "Anda tidak wajib membayar zakat.");
                    }
                } catch (NumberFormatException ex) {
                    txtHasil.setText("Input tidak valid! Harap masukkan angka.");
                }
            }
        });

        // Event tombol reset
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtTotalHarta.setText("");
                txtHasil.setText("");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            //ZakatMalCalculator calculator = new ZakatMalCalculator();
            //calculator.setVisible(true);
        });
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        SwingUtilities.invokeLater(() -> new MainApplication().setVisible(true));
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainApplication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    // End of variables declaration                   
}
