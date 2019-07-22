(ns com.google.cloud.compute.v1.ProjectRegionAddressName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectRegionAddressName$Builder]))

(defn ->builder
  "Constructor.

  project-region-address-name - `com.google.cloud.compute.v1.ProjectRegionAddressName`"
  (^ProjectRegionAddressName$Builder [^com.google.cloud.compute.v1.ProjectRegionAddressName project-region-address-name]
    (new ProjectRegionAddressName$Builder project-region-address-name)))

(defn get-address
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionAddressName$Builder this]
    (-> this (.getAddress))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionAddressName$Builder this]
    (-> this (.getProject))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionAddressName$Builder this]
    (-> this (.getRegion))))

(defn set-address
  "address - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionAddressName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionAddressName$Builder [^ProjectRegionAddressName$Builder this ^java.lang.String address]
    (-> this (.setAddress address))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionAddressName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionAddressName$Builder [^ProjectRegionAddressName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-region
  "region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionAddressName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionAddressName$Builder [^ProjectRegionAddressName$Builder this ^java.lang.String region]
    (-> this (.setRegion region))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectRegionAddressName`"
  (^com.google.cloud.compute.v1.ProjectRegionAddressName [^ProjectRegionAddressName$Builder this]
    (-> this (.build))))

