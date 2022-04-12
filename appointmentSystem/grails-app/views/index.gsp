<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Grails</title>
</head>
<body>
<content tag="nav">
    <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Application Status <span class="caret"></span></a>
        <ul class="dropdown-menu">
            <li class="dropdown-item"><a href="#">Environment: ${grails.util.Environment.current.name}</a></li>
            <li class="dropdown-item"><a href="#">App profile: ${grailsApplication.config.grails?.profile}</a></li>
            <li class="dropdown-item"><a href="#">App version:
                <g:meta name="info.app.version"/></a>
            </li>
            <li role="separator" class="dropdown-divider"></li>
            <li class="dropdown-item"><a href="#">Grails version:
                <g:meta name="info.app.grailsVersion"/></a>
            </li>
            <li class="dropdown-item"><a href="#">Groovy version: ${GroovySystem.getVersion()}</a></li>
            <li class="dropdown-item"><a href="#">JVM version: ${System.getProperty('java.version')}</a></li>
            <li role="separator" class="dropdown-divider"></li>
            <li class="dropdown-item"><a href="#">Reloading active: ${grails.util.Environment.reloadingAgentEnabled}</a></li>
        </ul>
    </li>
    <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Artefacts <span class="caret"></span></a>
        <ul class="dropdown-menu">
            <li class="dropdown-item"><a href="#">Controllers: ${grailsApplication.controllerClasses.size()}</a></li>
            <li class="dropdown-item"><a href="#">Domains: ${grailsApplication.domainClasses.size()}</a></li>
            <li class="dropdown-item"><a href="#">Services: ${grailsApplication.serviceClasses.size()}</a></li>
            <li class="dropdown-item"><a href="#">Tag Libraries: ${grailsApplication.tagLibClasses.size()}</a></li>
        </ul>
    </li>
    <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Installed Plugins <span class="caret"></span></a>
        <ul class="dropdown-menu">
            <g:each var="plugin" in="${applicationContext.getBean('pluginManager').allPlugins}">
                <li class="dropdown-item"><a href="#">${plugin.name} - ${plugin.version}</a></li>
            </g:each>
        </ul>
    </li>
</content>




<div id="content" role="main">
    <section class="row colset-2-its">
        <h1>Welcome to Sheffield Surgeries</h1>

        <p>
            Welcome to Sheffield Surgery


We have changed the way we provide our services in order to maintain safe social distancing and to reduce the risk of Covid-19 transmission for our patients and staff.

If you or anyone in your household has a temperature, a new continuous cough, or a lost or change in your taste or sense of smell, please vook a coronavirus test via NHS 111 online or phone 119. Please do not come to the surgery.

All appointments will now initally be conducted by telephone or Online. If after this initial assessment a face to face appointment is considered to be necessary then this will be offered. Please do not attend the surgery in person unless specifically invited to do so. When attended the surgery please wear a face covering.

Thank you for your cooperation.
        </p>

        <div id="controllers" role="navigation">
            <ul>
                <g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">
                    <button type="button" class="controllers">
                        <g:link controller="${c.logicalPropertyName}">${c.fullName}</g:link>
                    </button>
                </g:each>
            </ul>
        </div>
    </section>
</div>

</body>
</html>
