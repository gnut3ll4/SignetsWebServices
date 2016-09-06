package com.gnut3ll4.signetswebservices.model;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 4.5.8.1
//
// Created by Quasar Development at 06/09/2016
//
//---------------------------------------------------


import java.util.Hashtable;
import org.ksoap2.serialization.*;

public class HoraireExamenFinal extends AttributeContainer implements KvmSerializable
{

    
    public String sigle;
    
    public String groupe;
    
    public String dateExamen;
    
    public String heureDebut;
    
    public String heureFin;
    
    public String local;

    public HoraireExamenFinal()
    {
    }

    public HoraireExamenFinal(java.lang.Object paramObj, ExtendedSoapSerializationEnvelope __envelope)
    {
	    
	    if (paramObj == null)
            return;
        AttributeContainer inObj=(AttributeContainer)paramObj;


        if(inObj instanceof SoapObject)
        {
            SoapObject soapObject=(SoapObject)inObj;
            int size = soapObject.getPropertyCount();
            for (int i0=0;i0< size;i0++)
            {
                //if you have compilation error here, please use a ksoap2.jar and ExKsoap2.jar from libs folder (in the generated zip file)
                PropertyInfo info=soapObject.getPropertyInfo(i0);
                java.lang.Object obj = info.getValue(); 
                if (info.name.equals("sigle"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.sigle = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.sigle = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("groupe"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.groupe = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.groupe = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("dateExamen"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.dateExamen = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.dateExamen = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("heureDebut"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.heureDebut = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.heureDebut = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("heureFin"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.heureFin = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.heureFin = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("local"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.local = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.local = (String)obj;
                        }
                    }
                    continue;
                }

            }

        }



    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return this.sigle!=null?this.sigle:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.groupe!=null?this.groupe:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.dateExamen!=null?this.dateExamen:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.heureDebut!=null?this.heureDebut:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.heureFin!=null?this.heureFin:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5)
        {
            return this.local!=null?this.local:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 6;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "sigle";
            info.namespace= "http://etsmtl.ca/";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "groupe";
            info.namespace= "http://etsmtl.ca/";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "dateExamen";
            info.namespace= "http://etsmtl.ca/";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "heureDebut";
            info.namespace= "http://etsmtl.ca/";
        }
        if(propertyIndex==4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "heureFin";
            info.namespace= "http://etsmtl.ca/";
        }
        if(propertyIndex==5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "local";
            info.namespace= "http://etsmtl.ca/";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

}
