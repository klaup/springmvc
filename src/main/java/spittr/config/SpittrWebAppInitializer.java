package spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


//Ogni classe che estende AstractAnnotation[...]Initializer di fatto configura in modo automatico
//la DispatcherServlet e il context di Spring, e crea in automatico un ContextLoaderListener.
//L'utilizzo di questa classe per configurare la DispatcherServlet è alternativo all'uso
//del classico file web.xml. L'uso di questa classe funziona solo con Servlet 3.0 in poi
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return new Class<?>[] { RootConfig.class };

	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		 //Carica il context e i beans definiti dentro WebConfig
		return new Class<?>[] { WebConfig.class };

	}

	@Override
	protected String[] getServletMappings() {
		
		return new String[] {"/"};
	}

}
