package Core.MernisV2;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 5.11.6.0
//
// Created by Quasar Development 
//
//----------------------------------------------------



import org.ksoap2.HeaderProperty;
import org.ksoap2.serialization.*;

import java.util.ArrayList;
import java.util.List;


public class LUMKPSPublicV2Soap12
{
    interface LUMIWcfMethod
    {
        LUMExtendedSoapSerializationEnvelope CreateSoapEnvelope() throws java.lang.Exception;

        java.lang.Object ProcessResult(LUMExtendedSoapSerializationEnvelope __envelope,java.lang.Object result) throws java.lang.Exception;
    }

    String url="https://tckimlik.nvi.gov.tr/Service/KPSPublicV2.asmx";

    int timeOut=60000;
    
    public List< HeaderProperty> httpHeaders= new ArrayList< HeaderProperty>();
    public boolean enableLogging;


    public LUMKPSPublicV2Soap12(){}

    public LUMKPSPublicV2Soap12(String url)
    {
        this.url = url;
    }

    public LUMKPSPublicV2Soap12(String url,int timeOut)
    {
        this.url = url;
        this.timeOut=timeOut;
    }

    protected org.ksoap2.transport.Transport createTransport()
    {
        try
        {
            java.net.URI uri = new java.net.URI(url);
            if(uri.getScheme().equalsIgnoreCase("https"))
            {
                int port=uri.getPort()>0?uri.getPort():443;
                String path=uri.getPath();
                if(uri.getQuery()!=null && uri.getQuery()!="")
                {
                    path+="?"+uri.getQuery();
                }
                return new com.easywsdl.exksoap2.transport.AdvancedHttpsTransportSE(uri.getHost(), port, path, timeOut);
            }
            else
            {
                return new com.easywsdl.exksoap2.transport.AdvancedHttpTransportSE(url,timeOut);
            }

        }
        catch (java.net.URISyntaxException e)
        {
        }
        return null;
    }

    protected LUMExtendedSoapSerializationEnvelope createEnvelope()
    {
        LUMExtendedSoapSerializationEnvelope envelope= new LUMExtendedSoapSerializationEnvelope(LUMExtendedSoapSerializationEnvelope.VER12);
        envelope.enableLogging = enableLogging;
    
        return envelope;
    }

    protected java.util.List sendRequest(String methodName,LUMExtendedSoapSerializationEnvelope envelope,org.ksoap2.transport.Transport transport ,com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile profile )throws java.lang.Exception
    {
        if(transport instanceof com.easywsdl.exksoap2.transport.AdvancedHttpTransportSE )
        {
            return ((com.easywsdl.exksoap2.transport.AdvancedHttpTransportSE)transport).call(methodName, envelope,httpHeaders,null,profile);
        }
        else
        {
            return ((com.easywsdl.exksoap2.transport.AdvancedHttpsTransportSE)transport).call(methodName, envelope,httpHeaders,null,profile);
        }
    }

    java.lang.Object getResult(java.lang.Class destObj,java.lang.Object source,String resultName,LUMExtendedSoapSerializationEnvelope __envelope) throws java.lang.Exception
    {
        if(source==null)
        {
            return null;
        }
        if(source instanceof SoapPrimitive)
        {
            SoapPrimitive soap =(SoapPrimitive)source;
            if(soap.getName().equals(resultName))
            {
                java.lang.Object instance=__envelope.get(source,destObj,false);
                return instance;
            }
        }
        else
        {
            SoapObject soap = (SoapObject)source;
            if (soap.hasProperty(resultName))
            {
                java.lang.Object j=soap.getProperty(resultName);
                if(j==null)
                {
                    return null;
                }
                java.lang.Object instance=__envelope.get(j,destObj,false);
                return instance;
            }
            else if( soap.getName().equals(resultName)) 
            {
                java.lang.Object instance=__envelope.get(source,destObj,false);
                return instance;
            }
        }

        return null;
    }

    
    
    
    public Boolean KisiVeCuzdanDogrula(final Long TCKimlikNo,final String Ad,final String Soyad,final Boolean SoyadYok,final Integer DogumGun,final Boolean DogumGunYok,final Integer DogumAy,final Boolean DogumAyYok,final Integer DogumYil,final String CuzdanSeri,final Integer CuzdanNo,final String TCKKSeriNo) throws java.lang.Exception
    {
        com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile __profile = new com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile();
        return (Boolean)execute(new LUMIWcfMethod()
        {
            @Override
            public LUMExtendedSoapSerializationEnvelope CreateSoapEnvelope(){
                LUMExtendedSoapSerializationEnvelope __envelope = createEnvelope();
                SoapObject __soapReq = new SoapObject("http://tckimlik.nvi.gov.tr/WS", "KisiVeCuzdanDogrula");
                __envelope.setOutputSoapObject(__soapReq);
                
                PropertyInfo __info=null;
                __info = new PropertyInfo();
                __info.namespace="http://tckimlik.nvi.gov.tr/WS";
                __info.name="TCKimlikNo";
                __info.type=PropertyInfo.LONG_CLASS;
                __info.setValue(TCKimlikNo);
                __soapReq.addProperty(__info);
                __info = new PropertyInfo();
                __info.namespace="http://tckimlik.nvi.gov.tr/WS";
                __info.name="Ad";
                __info.type=PropertyInfo.STRING_CLASS;
                __info.setValue(Ad!=null?Ad:SoapPrimitive.NullSkip);
                __soapReq.addProperty(__info);
                __info = new PropertyInfo();
                __info.namespace="http://tckimlik.nvi.gov.tr/WS";
                __info.name="Soyad";
                __info.type=PropertyInfo.STRING_CLASS;
                __info.setValue(Soyad!=null?Soyad:SoapPrimitive.NullSkip);
                __soapReq.addProperty(__info);
                __info = new PropertyInfo();
                __info.namespace="http://tckimlik.nvi.gov.tr/WS";
                __info.name="SoyadYok";
                __info.type=PropertyInfo.BOOLEAN_CLASS;
                __info.setValue(SoyadYok);
                __soapReq.addProperty(__info);
                __info = new PropertyInfo();
                __info.namespace="http://tckimlik.nvi.gov.tr/WS";
                __info.name="DogumGun";
                __info.type=PropertyInfo.INTEGER_CLASS;
                __info.setValue(DogumGun!=null?DogumGun:SoapPrimitive.NullNilElement);
                __soapReq.addProperty(__info);
                __info = new PropertyInfo();
                __info.namespace="http://tckimlik.nvi.gov.tr/WS";
                __info.name="DogumGunYok";
                __info.type=PropertyInfo.BOOLEAN_CLASS;
                __info.setValue(DogumGunYok);
                __soapReq.addProperty(__info);
                __info = new PropertyInfo();
                __info.namespace="http://tckimlik.nvi.gov.tr/WS";
                __info.name="DogumAy";
                __info.type=PropertyInfo.INTEGER_CLASS;
                __info.setValue(DogumAy!=null?DogumAy:SoapPrimitive.NullNilElement);
                __soapReq.addProperty(__info);
                __info = new PropertyInfo();
                __info.namespace="http://tckimlik.nvi.gov.tr/WS";
                __info.name="DogumAyYok";
                __info.type=PropertyInfo.BOOLEAN_CLASS;
                __info.setValue(DogumAyYok);
                __soapReq.addProperty(__info);
                __info = new PropertyInfo();
                __info.namespace="http://tckimlik.nvi.gov.tr/WS";
                __info.name="DogumYil";
                __info.type=PropertyInfo.INTEGER_CLASS;
                __info.setValue(DogumYil);
                __soapReq.addProperty(__info);
                __info = new PropertyInfo();
                __info.namespace="http://tckimlik.nvi.gov.tr/WS";
                __info.name="CuzdanSeri";
                __info.type=PropertyInfo.STRING_CLASS;
                __info.setValue(CuzdanSeri!=null?CuzdanSeri:SoapPrimitive.NullSkip);
                __soapReq.addProperty(__info);
                __info = new PropertyInfo();
                __info.namespace="http://tckimlik.nvi.gov.tr/WS";
                __info.name="CuzdanNo";
                __info.type=PropertyInfo.INTEGER_CLASS;
                __info.setValue(CuzdanNo!=null?CuzdanNo:SoapPrimitive.NullNilElement);
                __soapReq.addProperty(__info);
                __info = new PropertyInfo();
                __info.namespace="http://tckimlik.nvi.gov.tr/WS";
                __info.name="TCKKSeriNo";
                __info.type=PropertyInfo.STRING_CLASS;
                __info.setValue(TCKKSeriNo!=null?TCKKSeriNo:SoapPrimitive.NullSkip);
                __soapReq.addProperty(__info);
                return __envelope;
            }
            
            @Override
            public java.lang.Object ProcessResult(LUMExtendedSoapSerializationEnvelope __envelope,java.lang.Object __result)throws java.lang.Exception {
                SoapObject __soap=(SoapObject)__result;
                java.lang.Object obj = __soap.getProperty("KisiVeCuzdanDogrulaResult");
                if (obj instanceof SoapPrimitive)
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    return Boolean.valueOf(j.toString());
                }
                else if (obj!= null && obj instanceof Boolean){
                    return (Boolean)obj;
                }
                return null;
            }
        },"http://tckimlik.nvi.gov.tr/WS/KisiVeCuzdanDogrula",__profile);
    }

    protected java.lang.Object execute(LUMIWcfMethod wcfMethod,String methodName,com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile profile) throws java.lang.Exception
    {
        org.ksoap2.transport.Transport __httpTransport=createTransport();
        __httpTransport.debug=enableLogging;
        LUMExtendedSoapSerializationEnvelope __envelope=wcfMethod.CreateSoapEnvelope();
        try
        {
            sendRequest(methodName, __envelope, __httpTransport,profile);
        }
        finally {
            if (__httpTransport.debug) {
                if (__httpTransport.requestDump != null) {
                    System.out.println("requestDump: "+__httpTransport.requestDump);

                }
                if (__httpTransport.responseDump != null) {
                    System.out.println("responseDump: "+__httpTransport.responseDump);
                }
            }
        }
        java.lang.Object __retObj = __envelope.bodyIn;
        if (__retObj instanceof org.ksoap2.SoapFault){
            org.ksoap2.SoapFault __fault = (org.ksoap2.SoapFault)__retObj;
            throw convertToException(__fault,__envelope);
        }else{
            return wcfMethod.ProcessResult(__envelope,__retObj);
        }
    }


    protected java.lang.Exception convertToException(org.ksoap2.SoapFault fault,LUMExtendedSoapSerializationEnvelope envelope)
    {
        org.ksoap2.SoapFault newException = fault;
        return newException;
    }
}


