(ns com.google.cloud.logging.SourceLocation$Builder
  "A builder for SourceLocation objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging SourceLocation$Builder]))

(defn set-file
  "Sets the source file name. Depending on the runtime environment, this might be a simple name
   or a fully-qualified name.

  file - `java.lang.String`

  returns: `com.google.cloud.logging.SourceLocation$Builder`"
  (^com.google.cloud.logging.SourceLocation$Builder [^SourceLocation$Builder this ^java.lang.String file]
    (-> this (.setFile file))))

(defn set-line
  "Sets the line within the source file. 1-based; 0 indicates no line number available.

  line - `java.lang.Long`

  returns: `com.google.cloud.logging.SourceLocation$Builder`"
  (^com.google.cloud.logging.SourceLocation$Builder [^SourceLocation$Builder this ^java.lang.Long line]
    (-> this (.setLine line))))

(defn set-function
  "Sets the human-readable name of the function or method being invoked, with optional context
   such as the class or package name. This information may be used in contexts such as the logs
   viewer, where a file and line number are less meaningful. The format can vary by language.

  function - `java.lang.String`

  returns: `com.google.cloud.logging.SourceLocation$Builder`"
  (^com.google.cloud.logging.SourceLocation$Builder [^SourceLocation$Builder this ^java.lang.String function]
    (-> this (.setFunction function))))

(defn build
  "returns: `com.google.cloud.logging.SourceLocation`"
  (^com.google.cloud.logging.SourceLocation [^SourceLocation$Builder this]
    (-> this (.build))))

