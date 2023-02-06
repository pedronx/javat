package CodeGym.Level16.L05_IntroducingFiles;

import java.nio.file.Path;

/**
 * Path class
 * Technically, Path is not a class — it is an interface.
 * This is done to allow the writing of a descendant of the Path class for each operating system (and file system).
 * That's why the Path interface is used everywhere in the methods that work with files,
 * though in reality the work happens through its descendant classes: WindowsPath, UnixPath, ...
 * To create a Path object (which will actually be an object of the WindowsPath descendant class),
 * you need to use a statement like this:
 *      Path name = Path.of(path);
 * -----------------------------------------
 * Path getParent()			Returns the parent directory
 * Path getFileName()		Returns the filename without the directory
 * Path getRoot()			Returns the root directory from a path
 * boolean isAbsolute()		Checks whether the current path is absolute
 * Path toAbsolutePath()	Converts the path to absolute
 * Path normalize()			Removes wildcards in a directory name.
 * Path resolve(Path other)	        Constructs a new absolute path from absolute and relative paths.
 * Path relativize(Path other)	    Gets a relative path from two absolute paths.
 * boolean startsWith(Path other)	Checks whether the current path starts with a given path
 * boolean endsWith(Path other)	    Checks whether the current path ends with a given path
 * int getNameCount()		Splits the path into parts using / as a delimiter.
 * 							Returns the number of parts.
 * Path getName(int index)	Splits the path into parts using / as a delimiter.
 * 							Returns a part by its index.
 * Path subpath(int beginIndex, int endIndex)	Splits the path into parts using / as a delimiter.
 * 								                Returns the subpath that corresponds to the given interval.
 * File toFile()				Converts a Path object to a deprecated File object
 * URI toUri()					Converts a Path object to a URI object
 */
public class PathClass {

    // Path to the file
    Path file = Path.of("src/CodeGym/Level16/L05_IntroducingFiles/log.txt");

    // Path to the directory
    Path directory = Path.of("\"src/CodeGym/Level16/L05_IntroducingFiles/");

    // getParent()
    String str = "src/CodeGym/Level16/L05_IntroducingFiles/log.txt";
    Path myPath = Path.of(str).getParent();
    
}
