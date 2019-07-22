(ns com.google.cloud.compute.v1.ManagedInstanceVersion$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ManagedInstanceVersion$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.ManagedInstanceVersion`

  returns: `com.google.cloud.compute.v1.ManagedInstanceVersion$Builder`"
  (^com.google.cloud.compute.v1.ManagedInstanceVersion$Builder [^ManagedInstanceVersion$Builder this ^com.google.cloud.compute.v1.ManagedInstanceVersion other]
    (-> this (.mergeFrom other))))

(defn get-instance-template
  "[Output Only] The intended template of the instance. This field is empty when current_action
   is one of { DELETING, ABANDONING }.

  returns: `java.lang.String`"
  (^java.lang.String [^ManagedInstanceVersion$Builder this]
    (-> this (.getInstanceTemplate))))

(defn set-instance-template
  "[Output Only] The intended template of the instance. This field is empty when current_action
   is one of { DELETING, ABANDONING }.

  instance-template - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ManagedInstanceVersion$Builder`"
  (^com.google.cloud.compute.v1.ManagedInstanceVersion$Builder [^ManagedInstanceVersion$Builder this ^java.lang.String instance-template]
    (-> this (.setInstanceTemplate instance-template))))

(defn get-name
  "[Output Only] Name of the version.

  returns: `java.lang.String`"
  (^java.lang.String [^ManagedInstanceVersion$Builder this]
    (-> this (.getName))))

(defn set-name
  "[Output Only] Name of the version.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ManagedInstanceVersion$Builder`"
  (^com.google.cloud.compute.v1.ManagedInstanceVersion$Builder [^ManagedInstanceVersion$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn build
  "returns: `com.google.cloud.compute.v1.ManagedInstanceVersion`"
  (^com.google.cloud.compute.v1.ManagedInstanceVersion [^ManagedInstanceVersion$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.ManagedInstanceVersion$Builder`"
  (^com.google.cloud.compute.v1.ManagedInstanceVersion$Builder [^ManagedInstanceVersion$Builder this]
    (-> this (.clone))))

