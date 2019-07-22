(ns com.google.cloud.logging.SourceLocation
  "Additional information about the source code location that produced the log entry."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging SourceLocation]))

(defn *new-builder
  "returns: `com.google.cloud.logging.SourceLocation$Builder`"
  (^com.google.cloud.logging.SourceLocation$Builder []
    (SourceLocation/newBuilder )))

(defn get-file
  "Returns the source file name. Depending on the runtime environment, this might be a simple name
   or a fully-qualified name.

  returns: `java.lang.String`"
  (^java.lang.String [^SourceLocation this]
    (-> this (.getFile))))

(defn get-line
  "Returns the line within the source file. 1-based; 0 indicates no line number available.

  returns: `java.lang.Long`"
  (^java.lang.Long [^SourceLocation this]
    (-> this (.getLine))))

(defn get-function
  "Returns the human-readable name of the function or method being invoked, with optional context
   such as the class or package name. This information may be used in contexts such as the logs
   viewer, where a file and line number are less meaningful. The format can vary by language.

  returns: `java.lang.String`"
  (^java.lang.String [^SourceLocation this]
    (-> this (.getFunction))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SourceLocation this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SourceLocation this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SourceLocation this]
    (-> this (.toString))))

(defn to-builder
  "returns: `com.google.cloud.logging.SourceLocation$Builder`"
  (^com.google.cloud.logging.SourceLocation$Builder [^SourceLocation this]
    (-> this (.toBuilder))))

