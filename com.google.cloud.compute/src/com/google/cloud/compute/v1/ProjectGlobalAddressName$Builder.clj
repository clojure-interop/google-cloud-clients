(ns com.google.cloud.compute.v1.ProjectGlobalAddressName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalAddressName$Builder]))

(defn ->builder
  "Constructor.

  project-global-address-name - `com.google.cloud.compute.v1.ProjectGlobalAddressName`"
  (^ProjectGlobalAddressName$Builder [^com.google.cloud.compute.v1.ProjectGlobalAddressName project-global-address-name]
    (new ProjectGlobalAddressName$Builder project-global-address-name)))

(defn get-address
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalAddressName$Builder this]
    (-> this (.getAddress))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalAddressName$Builder this]
    (-> this (.getProject))))

(defn set-address
  "address - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalAddressName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalAddressName$Builder [^ProjectGlobalAddressName$Builder this ^java.lang.String address]
    (-> this (.setAddress address))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalAddressName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalAddressName$Builder [^ProjectGlobalAddressName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectGlobalAddressName`"
  (^com.google.cloud.compute.v1.ProjectGlobalAddressName [^ProjectGlobalAddressName$Builder this]
    (-> this (.build))))

