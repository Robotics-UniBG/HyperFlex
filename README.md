## [HyperFlex Toolchain](http://robotics-unibg.github.com/HyperFlex/)

HyperFlex is a collection of Eclipse plugins that support the development of robotics software product lines, a family of similar applications that are built reusing a set of software components and share the same architecture. The SPL life cycle consists in three main phases: domain analysis, product line development, and product derivation.


### Domain Analysis

HyperFlex provides a tool for the analysis and the modeling of the variability in terms of a Feature Model.

### Product line Development

HyperFlex provides tools for designing software product line architectures for ROS and Orocos.

HyperFlex provides tools for defining variability resolution patterns.

### Product Derivation

HyperFlex provides a tool for selecting the desired functionalties of an application and automatically generating its architectural model.

## How to install the Plugin

The easiest way to install the plugins is using the Makefile 
* Download the [archive](http://lucagherardi.it/projects/HyperFlex/HyperFlexSetup.zip)
* Unzip it in a folder called (e.g. `HyperFlex`)
* From a shell access the folder (e.g. `HyperFlex`) and type `make`
* The process installs Eclipse and all the required plugins
* After that you can run it from the folder `eclipse` located in the same folder of the `Makefile`

The plugin can be installed from source (by accessing the [github repository](https://github.com/Robotics-UniBG/HyperFlex) or by means of the [update site](http://lucagherardi.it/projects/HyperFlex/UpdateSite) (if no plugins are showed try to unflag `Groups item by category`).

In order to install the plugin from source you need to setup the following environment:

* Download Eclipse Modeling Tools version from [Eclipse website](http://www.eclipse.org/downloads/)
* Install the Graphical Modeling Tooling plugin from this [update site](http://download.eclipse.org/modeling/gmp/gmf-tooling/updates/releases/)
* Install the Epsilon plugin from its update site ([Epsilon website](http://www.eclipse.org/epsilon/download/))

## Developers

Luca Gherardi (lucagh at ethz dot ch), Institute for Dynamic Systems and Control, ETH Zurich.

In collaboration with Davide Brugali, Department of Engineering, University of Bergamo.

## More information

More information can be found on the following papers:

* L. Gherardi, D. Brugali. [An eclipse-based Feature Models toolchain](http://www.best-of-robotics.org/pages/publications/UniBergamo_EclipseIT2011.pdf). _In Proc. of the 6th Workshop of the Italian Eclipse Community ([Eclipse-IT 2011](http://2011.eclipse-it.org/home/)), September 22-23, 2011, Milano, Italy.
* L. Gherardi. [Variability modeling and resolution in component-based robotics systems](http://lucagherardi.it/wp-content/papercite-data/pdf/gherardi2013variability.pdf)). PhD Thesis, April 2013.
