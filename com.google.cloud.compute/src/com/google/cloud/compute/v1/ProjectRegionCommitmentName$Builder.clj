(ns com.google.cloud.compute.v1.ProjectRegionCommitmentName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectRegionCommitmentName$Builder]))

(defn ->builder
  "Constructor.

  project-region-commitment-name - `com.google.cloud.compute.v1.ProjectRegionCommitmentName`"
  (^ProjectRegionCommitmentName$Builder [^com.google.cloud.compute.v1.ProjectRegionCommitmentName project-region-commitment-name]
    (new ProjectRegionCommitmentName$Builder project-region-commitment-name)))

(defn get-commitment
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionCommitmentName$Builder this]
    (-> this (.getCommitment))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionCommitmentName$Builder this]
    (-> this (.getProject))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionCommitmentName$Builder this]
    (-> this (.getRegion))))

(defn set-commitment
  "commitment - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionCommitmentName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionCommitmentName$Builder [^ProjectRegionCommitmentName$Builder this ^java.lang.String commitment]
    (-> this (.setCommitment commitment))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionCommitmentName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionCommitmentName$Builder [^ProjectRegionCommitmentName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-region
  "region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionCommitmentName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionCommitmentName$Builder [^ProjectRegionCommitmentName$Builder this ^java.lang.String region]
    (-> this (.setRegion region))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectRegionCommitmentName`"
  (^com.google.cloud.compute.v1.ProjectRegionCommitmentName [^ProjectRegionCommitmentName$Builder this]
    (-> this (.build))))

