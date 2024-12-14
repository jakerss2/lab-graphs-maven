package edu.grinnell.csc207.experiments;

import edu.grinnell.csc207.util.Edge;
import edu.grinnell.csc207.util.Graph;

import java.io.PrintWriter;
import java.util.List;

/**
 * A quick experiment with paths.
 *
 * @author Your Name Here
 * @author Your Name Here
 * @author Samuel A. Rebelsky
 */
public class PathExperiment {

  /**
   * Run the experiment.
   *
   * @param args
   *   Command-line arguments (ignored).
   */
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);
    Graph g = new Graph();

    g.addVertex("a");
    g.addVertex("b");
    g.addVertex("c");
    g.addVertex("d");
    g.addVertex("e");
    g.addVertex("f");
    g.addVertex("g");

    g.addEdge("a", "b", 5);
    g.addEdge("b", "c", 4);
    g.addEdge("c", "d", 6);
    g.addEdge("d", "e", 7);
    g.addEdge("e", "g", 3);
    g.addEdge("e", "a", 6);
    g.addEdge("c", "g", 3);
    g.addEdge("g", "e", 5);

    pen.println(g.path("a", "b"));
    pen.println(g.path("a", "c"));
    pen.println(g.path("a", "d"));
    pen.println(g.path("a", "e"));
    pen.println(g.path("a", "f"));
    pen.println(g.path("a", "g"));
    pen.println(g.path("a", "a"));
    pen.println("Done");

    List<Edge> edges = g.shortestPath(g.vertexNumber("a"), g.vertexNumber("g"));
    for (Edge edg : edges) {
      pen.println(edg.toString());
    } // for
  } // main(String[])

} // PathExperiment
