## [Variability Analysis and Resolution Plugin (VARP)](http://robotics-unibg.github.com/VARP/)

VARP is a collection of Eclipse plugins that support the development of robotics software product lines, a family of similar applications that are built reusing a set of software components and share the same architecture. The SPL life cycle consists in three main phases: domain analysis, product line development, and product derivation.

This branch contains the version integrated with BRIDE.


### Domain Analysis

VARP provides a tool for the analysis and the modeling of the variability in terms of a Feature Model.

### Product line Development

VARP has been integrated with [BRIDE](http://www.best-of-robotics.org/bride/), wihch allows the design of software product line architectures for ROS and Orocos.

VARP provides a tool for defining variability resolution patterns.

### Product Derivation

VARP provides a tool for selecting the desired functionalties of an application and automatically generating its architectural model.

## How to install the Plugin

The plugin can be installed from source (by accessing the [github repository](https://github.com/Robotics-UniBG/VARP) ) or by means of the [update site](http://) (coming soon).

In order to install the plugin from source you need to setup the following environment:

* [Eclipse Modeling Tools](http://www.eclipse.org/downloads/packages/eclipse-modeling-tools/junosr1)
* with the Graphical Modeling Tooling [update site](http://download.eclipse.org/modeling/gmp/gmf-tooling/updates/releases/) 


## Developers

Luca Gherardi (luca dot gherardi at unibg dot it), University of Bergamo.

Supervisor: Davide Brugali, University of Bergamo.

## More information

More information can be found on the following papers:

* L. Gherardi, D. Brugali. [An eclipse-based Feature Models toolchain](http://www.best-of-robotics.org/pages/publications/UniBergamo_EclipseIT2011.pdf). _In Proc. of the 6th Workshop of the Italian Eclipse Community ([Eclipse-IT 2011](http://2011.eclipse-it.org/home/))_, September 22-23, 2011, Milano, Italy.
