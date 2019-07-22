(ns com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NodeTemplateNodeTypeFlexibility$Builder]))

(defn get-local-ssd
  "returns: `java.lang.String`"
  (^java.lang.String [^NodeTemplateNodeTypeFlexibility$Builder this]
    (-> this (.getLocalSsd))))

(defn get-cpus
  "returns: `java.lang.String`"
  (^java.lang.String [^NodeTemplateNodeTypeFlexibility$Builder this]
    (-> this (.getCpus))))

(defn set-cpus
  "cpus - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility$Builder`"
  (^com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility$Builder [^NodeTemplateNodeTypeFlexibility$Builder this ^java.lang.String cpus]
    (-> this (.setCpus cpus))))

(defn build
  "returns: `com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility`"
  (^com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility [^NodeTemplateNodeTypeFlexibility$Builder this]
    (-> this (.build))))

(defn set-local-ssd
  "local-ssd - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility$Builder`"
  (^com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility$Builder [^NodeTemplateNodeTypeFlexibility$Builder this ^java.lang.String local-ssd]
    (-> this (.setLocalSsd local-ssd))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility`

  returns: `com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility$Builder`"
  (^com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility$Builder [^NodeTemplateNodeTypeFlexibility$Builder this ^com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility other]
    (-> this (.mergeFrom other))))

(defn clone
  "returns: `com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility$Builder`"
  (^com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility$Builder [^NodeTemplateNodeTypeFlexibility$Builder this]
    (-> this (.clone))))

(defn set-memory
  "memory - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility$Builder`"
  (^com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility$Builder [^NodeTemplateNodeTypeFlexibility$Builder this ^java.lang.String memory]
    (-> this (.setMemory memory))))

(defn get-memory
  "returns: `java.lang.String`"
  (^java.lang.String [^NodeTemplateNodeTypeFlexibility$Builder this]
    (-> this (.getMemory))))

