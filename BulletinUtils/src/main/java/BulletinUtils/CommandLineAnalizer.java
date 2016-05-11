/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BulletinUtils;

/**
 *
 * @author jeen
 */
import org.apache.commons.cli.Options;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.PosixParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.ParseException;
import java.util.Collection;
import java.util.Iterator;

public  class CommandLineAnalizer {
    private static Options options;
    private static CommandLine cmd=null;
    private String[] args;
    public CommandLineAnalizer(String[] args){
        this.args = args;
        init();
    }

    private void init(){
        options = new Options();
        options.addOption("s",true,"Source file or directory (folder)");
        //options.addOption("f",true,"Input file name");
        options.addOption("d","dest",true,"Destination url");
        options.addOption("m", "move" , false, "move files. DELETE source file");
        options.addOption("u", "user" , false, "username");
        options.addOption("h", "help" , false, "print usage");        
        options.addOption("p", "password" , false, "parse file and print in to stdout");
        
//options.addOption("cp", "codepage" , true, "input file code page. Default cp1251");
        
        CommandLineParser parser=new PosixParser();
        try{
            cmd=parser.parse(options, this.args);
        }
        catch(ParseException ex){
            System.err.println(ex.getMessage());
        }
    }
    
    public boolean isDatabaseConnect(){
        return cmd != null && cmd.hasOption("db");
    }
    public boolean isPrintUsage(){
        return cmd.hasOption("h");
    }
    public static void  printUsage(){
        if(cmd!=null && cmd.hasOption("h")){
            Collection <Option>col= options.getOptions();
            Iterator <Option>it = col.iterator();
            while(it.hasNext()){
                Option op = it.next();
                System.err.println( op.getOpt()+" "+op.getDescription() );
            }
            
        }
    }
    public boolean isParseOnly(){
        return cmd != null && cmd.hasOption('p');
    }
    public String getInputFileCodePage(){
        if(cmd!=null && cmd.hasOption("cp")){
            return cmd.getOptionValue("cp");
        }
        else{
            return "CP1251";
        }
    }
    public String getFileType(){
        if( cmd != null && cmd.hasOption('t') ){
            return cmd.getOptionValue('t');
        }
        else{
            return "donavtovokzal";
        }
    }
    public String getInputFileName(){
        if(cmd!=null && cmd.hasOption('s')){
            return cmd.getOptionValue('s');
        }
        else{
            return "";
        }
    }
    public String getUsername(){
        return cmd.getOptionValue('u') == null ? "signal4":cmd.getOptionValue('u');
    }
    public String getPassword(){
        return cmd.getOptionValue('p') == null ? "fredi":cmd.getOptionValue('p');
    }
    public String getDestenationUrl(){
        return cmd.getOptionValue('d');
    }
    public boolean isMove(){
        return cmd.hasOption('m') ;
    }

}
