(ns com.google.cloud.compute.v1.ProjectRegionRouterName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectRegionRouterName$Builder]))

(defn ->builder
  "Constructor.

  project-region-router-name - `com.google.cloud.compute.v1.ProjectRegionRouterName`"
  (^ProjectRegionRouterName$Builder [^com.google.cloud.compute.v1.ProjectRegionRouterName project-region-router-name]
    (new ProjectRegionRouterName$Builder project-region-router-name)))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionRouterName$Builder this]
    (-> this (.getProject))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionRouterName$Builder this]
    (-> this (.getRegion))))

(defn get-router
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionRouterName$Builder this]
    (-> this (.getRouter))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionRouterName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionRouterName$Builder [^ProjectRegionRouterName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-region
  "region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionRouterName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionRouterName$Builder [^ProjectRegionRouterName$Builder this ^java.lang.String region]
    (-> this (.setRegion region))))

(defn set-router
  "router - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionRouterName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionRouterName$Builder [^ProjectRegionRouterName$Builder this ^java.lang.String router]
    (-> this (.setRouter router))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectRegionRouterName`"
  (^com.google.cloud.compute.v1.ProjectRegionRouterName [^ProjectRegionRouterName$Builder this]
    (-> this (.build))))

