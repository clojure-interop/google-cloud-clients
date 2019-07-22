(ns com.google.cloud.compute.v1.TestFailure$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TestFailure$Builder]))

(defn set-actual-service
  "actual-service - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TestFailure$Builder`"
  (^com.google.cloud.compute.v1.TestFailure$Builder [^TestFailure$Builder this ^java.lang.String actual-service]
    (-> this (.setActualService actual-service))))

(defn set-path
  "path - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TestFailure$Builder`"
  (^com.google.cloud.compute.v1.TestFailure$Builder [^TestFailure$Builder this ^java.lang.String path]
    (-> this (.setPath path))))

(defn get-path
  "returns: `java.lang.String`"
  (^java.lang.String [^TestFailure$Builder this]
    (-> this (.getPath))))

(defn build
  "returns: `com.google.cloud.compute.v1.TestFailure`"
  (^com.google.cloud.compute.v1.TestFailure [^TestFailure$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.TestFailure`

  returns: `com.google.cloud.compute.v1.TestFailure$Builder`"
  (^com.google.cloud.compute.v1.TestFailure$Builder [^TestFailure$Builder this ^com.google.cloud.compute.v1.TestFailure other]
    (-> this (.mergeFrom other))))

(defn set-host
  "host - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TestFailure$Builder`"
  (^com.google.cloud.compute.v1.TestFailure$Builder [^TestFailure$Builder this ^java.lang.String host]
    (-> this (.setHost host))))

(defn get-expected-service
  "returns: `java.lang.String`"
  (^java.lang.String [^TestFailure$Builder this]
    (-> this (.getExpectedService))))

(defn clone
  "returns: `com.google.cloud.compute.v1.TestFailure$Builder`"
  (^com.google.cloud.compute.v1.TestFailure$Builder [^TestFailure$Builder this]
    (-> this (.clone))))

(defn get-host
  "returns: `java.lang.String`"
  (^java.lang.String [^TestFailure$Builder this]
    (-> this (.getHost))))

(defn get-actual-service
  "returns: `java.lang.String`"
  (^java.lang.String [^TestFailure$Builder this]
    (-> this (.getActualService))))

(defn set-expected-service
  "expected-service - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TestFailure$Builder`"
  (^com.google.cloud.compute.v1.TestFailure$Builder [^TestFailure$Builder this ^java.lang.String expected-service]
    (-> this (.setExpectedService expected-service))))

