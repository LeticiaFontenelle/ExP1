
package view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import negocio.Libra;
import negocio.Metro;
import negocio.Pe;
import negocio.Quilograma;


public class Formulario {

    
    private JFrame frmUnidadeMetrica;
    private JLabel lblUnidadeMassa, lblUnidadeTamanho, lblResultado, lblTipoConversao;
    private JTextField txtUnidadeMassa, txtUnidadeTamanho;
    private JComboBox cboTipoConversao;
    private JButton btnConverter;
    
    public Formulario() {
        inicializarComponentes ();
    }

    private void inicializarComponentes() {
        frmUnidadeMetrica = new JFrame ("Conversão de medidas"); 
        frmUnidadeMetrica.setBounds (400, 300, 500, 350);  
        frmUnidadeMetrica.setDefaultCloseOperation (JFrame. EXIT_ON_CLOSE);          
        frmUnidadeMetrica.setLocationRelativeTo(null); 
        frmUnidadeMetrica.setLayout(null);        
        Container painel = frmUnidadeMetrica.getContentPane(); 
        
        lblTipoConversao= new JLabel ("Escolha o tipo de conversão desejada");
        lblTipoConversao.setBounds (40, 30, 250, 25); 
        painel.add (lblTipoConversao); 
        
        cboTipoConversao = new JComboBox(); 
        cboTipoConversao.setBounds (40, 60, 200, 25);
        cboTipoConversao.addItem("de quilogramas para libras"); 
        cboTipoConversao.addItem("de libras para quilogramas"); 
        cboTipoConversao.addItem("de metros para pés"); 
        cboTipoConversao.addItem("de pés para metros"); 
        painel.add (cboTipoConversao);
        
        lblUnidadeMassa = new JLabel ("Unidade massa");
        lblUnidadeMassa.setBounds (320, 30, 120, 25);
        painel.add (lblUnidadeMassa); 
        
        txtUnidadeMassa = new JTextField (); 
        txtUnidadeMassa.setBounds (320, 60, 60, 25); 
        painel.add (txtUnidadeMassa); 
        
        
        lblResultado = new JLabel ("Resultado: ");
        lblResultado.setBounds(100, 230, 250, 25);
        painel.add(lblResultado); 
        
                
        lblUnidadeTamanho = new JLabel ("Unidade tamanho");
        lblUnidadeTamanho.setBounds (320, 100, 120, 25);
        painel.add (lblUnidadeTamanho); 
        
        txtUnidadeTamanho = new JTextField (); 
        txtUnidadeTamanho.setBounds (320, 130, 60, 25); 
        painel.add (txtUnidadeTamanho); 
        
        btnConverter = new JButton ("Converter");
        btnConverter.setBounds(150, 180, 180, 25);
        btnConverter.addActionListener(new ActionListener () {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
              float valorOriginal; 
              String msg =""; 
              //verifica qual tipo de conversão foi selecionada
              switch (cboTipoConversao.getSelectedIndex ()){
                  case 1:                 
                      valorOriginal = Float.parseFloat (txtUnidadeMassa.getText());
                      Libra objLibra = new Libra(valorOriginal); 
                      objLibra.converter (); 
                      msg= String.format("%.2fkg -> %.2flbs", valorOriginal, objLibra.getLibra());  
                      break; 
                      
                  case 2:                 
                      valorOriginal = Float.parseFloat (txtUnidadeMassa.getText());
                      Quilograma objQuilograma = new Quilograma(valorOriginal); 
                      objQuilograma.converter (); 
                      msg= String.format("%.2fkg -> %.2flbs", valorOriginal, objQuilograma.getQuilo());  
                       break;
                                  
                  case 3:
                      valorOriginal = Float.parseFloat (txtUnidadeTamanho.getText());
                      Pe objPe = new Pe(valorOriginal); 
                      objPe.converter (); 
                     msg= String.format("%.2fkg -> %.2flbs", valorOriginal, objPe.getPe());   
                      break;         
                      
                  case 4:
                      valorOriginal = Float.parseFloat (txtUnidadeTamanho.getText());
                      Metro objMetro = new Metro(valorOriginal); 
                      objMetro.converter (); 
                      msg= String.format("%.2fkg -> %.2flbs", valorOriginal, objMetro.getMetro());   
                       break;             
                  }
                 lblResultado.setText (msg);
             }
        });
                  
        painel.add(btnConverter); 
        
        frmUnidadeMetrica.setVisible(true); 
        
        
        
    }
    
 }
