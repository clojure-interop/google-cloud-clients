(ns com.google.cloud.compute.v1.UrlMapTest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 UrlMapTest$Builder]))

(defn set-description
  "Description of this test case.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UrlMapTest$Builder`"
  (^com.google.cloud.compute.v1.UrlMapTest$Builder [^UrlMapTest$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-service
  "Expected BackendService resource the given URL should be mapped to.

  service - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UrlMapTest$Builder`"
  (^com.google.cloud.compute.v1.UrlMapTest$Builder [^UrlMapTest$Builder this ^java.lang.String service]
    (-> this (.setService service))))

(defn set-path
  "Path portion of the URL.

  path - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UrlMapTest$Builder`"
  (^com.google.cloud.compute.v1.UrlMapTest$Builder [^UrlMapTest$Builder this ^java.lang.String path]
    (-> this (.setPath path))))

(defn get-path
  "Path portion of the URL.

  returns: `java.lang.String`"
  (^java.lang.String [^UrlMapTest$Builder this]
    (-> this (.getPath))))

(defn get-service
  "Expected BackendService resource the given URL should be mapped to.

  returns: `java.lang.String`"
  (^java.lang.String [^UrlMapTest$Builder this]
    (-> this (.getService))))

(defn build
  "returns: `com.google.cloud.compute.v1.UrlMapTest`"
  (^com.google.cloud.compute.v1.UrlMapTest [^UrlMapTest$Builder this]
    (-> this (.build))))

(defn get-description
  "Description of this test case.

  returns: `java.lang.String`"
  (^java.lang.String [^UrlMapTest$Builder this]
    (-> this (.getDescription))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.UrlMapTest`

  returns: `com.google.cloud.compute.v1.UrlMapTest$Builder`"
  (^com.google.cloud.compute.v1.UrlMapTest$Builder [^UrlMapTest$Builder this ^com.google.cloud.compute.v1.UrlMapTest other]
    (-> this (.mergeFrom other))))

(defn set-host
  "Host portion of the URL.

  host - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UrlMapTest$Builder`"
  (^com.google.cloud.compute.v1.UrlMapTest$Builder [^UrlMapTest$Builder this ^java.lang.String host]
    (-> this (.setHost host))))

(defn clone
  "returns: `com.google.cloud.compute.v1.UrlMapTest$Builder`"
  (^com.google.cloud.compute.v1.UrlMapTest$Builder [^UrlMapTest$Builder this]
    (-> this (.clone))))

(defn get-host
  "Host portion of the URL.

  returns: `java.lang.String`"
  (^java.lang.String [^UrlMapTest$Builder this]
    (-> this (.getHost))))

