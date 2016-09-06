package com.gnut3ll4.signetswebservices.model;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 4.5.8.1
//
// Created by Quasar Development at 06/09/2016
//
//---------------------------------------------------



import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.*;
import org.kxml2.io.KXmlParser;
import org.kxml2.kdom.Element;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Vector;
import java.io.StringReader;
import java.io.StringWriter;

public class ExtendedSoapSerializationEnvelope extends SoapSerializationEnvelope {
    static HashMap< java.lang.String,java.lang.Class> classNames = new HashMap< java.lang.String, java.lang.Class>();
    static {
        classNames.put("http://etsmtl.ca/^^Etudiant",Etudiant.class);
        classNames.put("http://etsmtl.ca/^^DonneesRetournees",DonneesRetournees.class);
        classNames.put("http://etsmtl.ca/^^ListeDeCours",ListeDeCours.class);
        classNames.put("http://etsmtl.ca/^^Cours",Cours.class);
        classNames.put("http://etsmtl.ca/^^ListeDeSessions",ListeDeSessions.class);
        classNames.put("http://etsmtl.ca/^^Trimestre",Trimestre.class);
        classNames.put("http://etsmtl.ca/^^listeDesProgrammes",listeDesProgrammes.class);
        classNames.put("http://etsmtl.ca/^^Programme",Programme.class);
        classNames.put("http://etsmtl.ca/^^listeDesCoequipiers",listeDesCoequipiers.class);
        classNames.put("http://etsmtl.ca/^^Personne",Personne.class);
        classNames.put("http://etsmtl.ca/^^ListeDesElementsEvaluation",ListeDesElementsEvaluation.class);
        classNames.put("http://etsmtl.ca/^^ElementEvaluation",ElementEvaluation.class);
        classNames.put("http://etsmtl.ca/^^listeDesActivitesEtProf",listeDesActivitesEtProf.class);
        classNames.put("http://etsmtl.ca/^^HoraireActivite",HoraireActivite.class);
        classNames.put("http://etsmtl.ca/^^Enseignant",Enseignant.class);
        classNames.put("http://etsmtl.ca/^^listeHoraireExamensFinaux",listeHoraireExamensFinaux.class);
        classNames.put("http://etsmtl.ca/^^HoraireExamenFinal",HoraireExamenFinal.class);
        classNames.put("http://etsmtl.ca/^^listeCoursHoraire",listeCoursHoraire.class);
        classNames.put("http://etsmtl.ca/^^coursHoraire",coursHoraire.class);
        classNames.put("http://etsmtl.ca/^^listeJoursRemplaces",listeJoursRemplaces.class);
        classNames.put("http://etsmtl.ca/^^JoursRemplaces",JoursRemplaces.class);
        classNames.put("http://etsmtl.ca/^^listeSeances",listeSeances.class);
        classNames.put("http://etsmtl.ca/^^Seances",Seances.class);
        classNames.put("http://etsmtl.ca/^^ListeEvaluationsCours",ListeEvaluationsCours.class);
        classNames.put("http://etsmtl.ca/^^EvaluationCours",EvaluationCours.class);
        classNames.put("http://etsmtl.ca/^^ArrayOfCours",ArrayOfCours.class);
        classNames.put("http://etsmtl.ca/^^ArrayOfTrimestre",ArrayOfTrimestre.class);
        classNames.put("http://etsmtl.ca/^^ArrayOfProgramme",ArrayOfProgramme.class);
        classNames.put("http://etsmtl.ca/^^ArrayOfPersonne",ArrayOfPersonne.class);
        classNames.put("http://etsmtl.ca/^^ArrayOfElementEvaluation",ArrayOfElementEvaluation.class);
        classNames.put("http://etsmtl.ca/^^ArrayOfHoraireActivite",ArrayOfHoraireActivite.class);
        classNames.put("http://etsmtl.ca/^^ArrayOfEnseignant",ArrayOfEnseignant.class);
        classNames.put("http://etsmtl.ca/^^ArrayOfHoraireExamenFinal",ArrayOfHoraireExamenFinal.class);
        classNames.put("http://etsmtl.ca/^^ArrayOfCoursHoraire",ArrayOfCoursHoraire.class);
        classNames.put("http://etsmtl.ca/^^ArrayOfJoursRemplaces",ArrayOfJoursRemplaces.class);
        classNames.put("http://etsmtl.ca/^^ArrayOfSeances",ArrayOfSeances.class);
        classNames.put("http://etsmtl.ca/^^ArrayOfEvaluationCours",ArrayOfEvaluationCours.class);
    }   

    protected static final int QNAME_NAMESPACE = 0;
    private static final String TYPE_LABEL = "type";

    public ExtendedSoapSerializationEnvelope() {
        this(SoapEnvelope.VER11);
    }

    public ExtendedSoapSerializationEnvelope(int soapVersion) {
        super(soapVersion);
        implicitTypes = true;
        setAddAdornments(false);
        new MarshalGuid().register(this);
        new MarshalFloat().register(this);
    }

    

    @Override
    protected void writeProperty(XmlSerializer writer, java.lang.Object obj, PropertyInfo type) throws IOException {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if (obj == null || obj== SoapPrimitive.NullNilElement) {
            writer.attribute(xsi, version >= VER12 ? NIL_LABEL : NULL_LABEL, "true");
            return;
        }
        java.lang.Object[] qName = getInfo(null, obj);
        if (!type.multiRef && qName[2] == null )
        {

            if (!implicitTypes || (obj.getClass() != type.type && !(obj instanceof Vector ) && type.type!=java.lang.String.class  )) {
                java.lang.String xmlName= Helper.getKeyByValue(classNames,obj.getClass());
                if(xmlName!=null) {
                    java.lang.String[] parts = xmlName.split("\\^\\^");
                    java.lang.String prefix = writer.getPrefix(parts[0], true);
                    writer.attribute(xsi, TYPE_LABEL, prefix + ":" + parts[1]);
                }
                else
                {
                    if(type.type instanceof String) {
                        java.lang.String xsdPrefix = writer.getPrefix(xsd, true);
                        java.lang.String myType = (java.lang.String) type.type;
                        java.lang.String[] parts = myType.split("\\^\\^");
                        if (parts.length == 2) {
                            xsdPrefix = writer.getPrefix(parts[0], true);
                            myType = parts[1];
                        }

                        writer.attribute(xsi, TYPE_LABEL, xsdPrefix + ":" + myType);
                    }
                    else
                    {
                        java.lang.String prefix = writer.getPrefix(type.namespace, true);
                        writer.attribute(xsi, TYPE_LABEL, prefix + ":" + obj.getClass().getSimpleName());
                    }

                }
            }
            //super.writeProperty(writer,obj,type);

            //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
            //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
            writeElement(writer, obj, type, qName[QNAME_MARSHAL]);
        }
        else {
            super.writeProperty(writer, obj, type);
        }
    }
    public SoapObject GetExceptionDetail(Element detailElement,java.lang.String exceptionElementNS,java.lang.String exceptionElementName)
    {
        int index=detailElement.indexOf(exceptionElementNS,exceptionElementName,0);
        if(index>-1)
        {
            Element errorElement=detailElement.getElement(index);
            return GetSoapObject(errorElement);
        }
        return null;
    }

    public SoapObject GetSoapObject(Element detailElement) {
        try{
            XmlSerializer xmlSerializer = XmlPullParserFactory.newInstance().newSerializer();
            StringWriter writer = new StringWriter();
            xmlSerializer.setOutput(writer);
            detailElement.write(xmlSerializer);
            xmlSerializer.flush();

            XmlPullParser xpp = new KXmlParser();
            xpp.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, true);

            xpp.setInput(new StringReader(writer.toString()));
            xpp.nextTag();
            SoapObject soapObj = new SoapObject(detailElement.getNamespace(),detailElement.getName());
            readSerializable(xpp,soapObj);
            return soapObj;
        }
        catch (java.lang.Exception ex)
        {
            ex.printStackTrace();
        }
        return null;
    }

    public java.lang.Object GetHeader(Element detailElement) {
        if(detailElement.getChildCount()>0 && detailElement.getText(0)!=null)
        {
            SoapPrimitive primitive = new SoapPrimitive(detailElement.getNamespace(),detailElement.getName(),detailElement.getText(0));
            return  primitive;
        }
    
        return GetSoapObject(detailElement);
    }
    
    public java.lang.Object get(java.lang.Object soap,java.lang.Class cl)
    {
        if(soap==null)
        {
            return null;
        }
        try
        {
            if(soap instanceof  Vector)
            {
                Constructor ctor = cl.getConstructor(java.lang.Object.class,ExtendedSoapSerializationEnvelope.class);
                return ctor.newInstance(soap,this);
            }
            {
                if(soap instanceof SoapObject)
                {
                    if(cl ==SoapObject.class)
                    {
                        return soap;
                    }
                    java.lang.String key=String.format("%s^^%s",((SoapObject)soap).getNamespace(),((SoapObject)soap).getName());
                    if(classNames.containsKey(key))
                    {
                        cl=classNames.get(key);
                    }
                }
                Constructor ctor = cl.getConstructor(java.lang.Object.class,ExtendedSoapSerializationEnvelope.class);
                return ctor.newInstance(soap,this);
            }
        }
        catch (java.lang.Exception ex)
        {
            ex.printStackTrace();
            return null;
        }
    }

} 

