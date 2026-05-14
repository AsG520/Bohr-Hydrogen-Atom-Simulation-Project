# Hydrogen-Atom-Simulation-Project

Features in Simulation
- Real time animation using a timer.
- Electron orbiting in a circular motion based on some angle theta. 
- Proton located in the nucleus of the atom.
- Orbital shell guiding the path of the electron.
- 2D representation of the Hydrogen atom. 

Math Concepts in Simulation
- Vector Diagram.
- Sine Trigonometric Function.
- Cosine Trigonometric Function.

How it Works
- The program initializes important variables for the frame, proton, electron, orbital shell, and colors.
- Runs a window with the dimensions of width and height both being 500.
- Sets a HydrogenAtomSimulation panel, which is extended in the JPanel from the public class.
- Timer is used to update the position of the electron from the updateElectron function for every 50 milliseconds.
- The paintComponent is used to draw the proton, electron, and shell in the following panel on the window.
- Variables at the beginning of the program were passed in the Graphics g properties (e.g. g.setColor, g.fillOval, and g.drawOval) to visual each element.

Requirements
- Java (JDK 8 or higher).
- IDE (e.g., VS Code, Eclipse, or IntelliJ).

How to Run
  1) Copy the code into a Java file named "HydrogenAtomSimulation.java".
  2) Compile the program: "javac HydrogenAtomSimulation.java".
  3) Run the program: "java HydrogenAtomSimulation".

Video Details for Simulation 

I plan to make a YouTube video that will showcase the history behide the Bohr-Rutherford diagram, more deep explanation of how I programmed the project, and share general chemistry knowledge. This video will help give me a reflection on what I learned and for others who are interested in this particular subject and simulation :D.

Video Link of Simulating a Bohr-Rutherford Diagram of Hydrogen in Java - [Coming
Soon!].
