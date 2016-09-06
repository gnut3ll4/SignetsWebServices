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

public class ListeDesElementsEvaluation extends DonneesRetournees implements KvmSerializable
{

    
    public String noteACeJour;
    
    public String scoreFinalSur100;
    
    public String moyenneClasse;
    
    public String ecartTypeClasse;
    
    public String medianeClasse;
    
    public String rangCentileClasse;
    
    public String noteACeJourElementsIndividuels;
    
    public String noteSur100PourElementsIndividuels;
    
    public ArrayOfElementEvaluation liste;

    public ListeDesElementsEvaluation()
    {
    }

    public ListeDesElementsEvaluation(java.lang.Object paramObj, ExtendedSoapSerializationEnvelope __envelope)
    {
	    super(paramObj, __envelope);
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
                if (info.name.equals("noteACeJour"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.noteACeJour = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.noteACeJour = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("scoreFinalSur100"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.scoreFinalSur100 = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.scoreFinalSur100 = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("moyenneClasse"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.moyenneClasse = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.moyenneClasse = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("ecartTypeClasse"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.ecartTypeClasse = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.ecartTypeClasse = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("medianeClasse"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.medianeClasse = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.medianeClasse = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("rangCentileClasse"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.rangCentileClasse = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.rangCentileClasse = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("noteACeJourElementsIndividuels"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.noteACeJourElementsIndividuels = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.noteACeJourElementsIndividuels = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("noteSur100PourElementsIndividuels"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.noteSur100PourElementsIndividuels = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.noteSur100PourElementsIndividuels = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("liste"))
                {
                    if(obj!=null)
                    {
                        java.lang.Object j = obj;
                        this.liste = new ArrayOfElementEvaluation(j,__envelope);
                    }
                    continue;
                }

            }

        }



    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        int count = super.getPropertyCount();
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==count+0)
        {
            return this.noteACeJour!=null?this.noteACeJour:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.scoreFinalSur100!=null?this.scoreFinalSur100:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.moyenneClasse!=null?this.moyenneClasse:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.ecartTypeClasse!=null?this.ecartTypeClasse:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.medianeClasse!=null?this.medianeClasse:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.rangCentileClasse!=null?this.rangCentileClasse:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.noteACeJourElementsIndividuels!=null?this.noteACeJourElementsIndividuels:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+7)
        {
            return this.noteSur100PourElementsIndividuels!=null?this.noteSur100PourElementsIndividuels:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+8)
        {
            return this.liste!=null?this.liste:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+9;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "noteACeJour";
            info.namespace= "http://etsmtl.ca/";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "scoreFinalSur100";
            info.namespace= "http://etsmtl.ca/";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "moyenneClasse";
            info.namespace= "http://etsmtl.ca/";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "ecartTypeClasse";
            info.namespace= "http://etsmtl.ca/";
        }
        if(propertyIndex==count+4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "medianeClasse";
            info.namespace= "http://etsmtl.ca/";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "rangCentileClasse";
            info.namespace= "http://etsmtl.ca/";
        }
        if(propertyIndex==count+6)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "noteACeJourElementsIndividuels";
            info.namespace= "http://etsmtl.ca/";
        }
        if(propertyIndex==count+7)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "noteSur100PourElementsIndividuels";
            info.namespace= "http://etsmtl.ca/";
        }
        if(propertyIndex==count+8)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "liste";
            info.namespace= "http://etsmtl.ca/";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

}
