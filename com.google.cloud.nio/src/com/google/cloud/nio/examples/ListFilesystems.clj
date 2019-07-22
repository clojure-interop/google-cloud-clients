(ns com.google.cloud.nio.examples.ListFilesystems
  "ListFilesystems is a super-simple program that lists the available NIO filesystems."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.nio.examples ListFilesystems]))

(defn ->list-filesystems
  "Constructor."
  (^ListFilesystems []
    (new ListFilesystems )))

(defn *main
  "See the class documentation.

  args - `java.lang.String[]`

  throws: java.io.IOException"
  ([args]
    (ListFilesystems/main args)))

