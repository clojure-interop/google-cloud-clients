(ns com.google.cloud.compute.v1.ProjectRegionInterconnectAttachmentName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectRegionInterconnectAttachmentName$Builder]))

(defn ->builder
  "Constructor.

  project-region-interconnect-attachment-name - `com.google.cloud.compute.v1.ProjectRegionInterconnectAttachmentName`"
  (^ProjectRegionInterconnectAttachmentName$Builder [^com.google.cloud.compute.v1.ProjectRegionInterconnectAttachmentName project-region-interconnect-attachment-name]
    (new ProjectRegionInterconnectAttachmentName$Builder project-region-interconnect-attachment-name)))

(defn get-interconnect-attachment
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionInterconnectAttachmentName$Builder this]
    (-> this (.getInterconnectAttachment))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionInterconnectAttachmentName$Builder this]
    (-> this (.getProject))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionInterconnectAttachmentName$Builder this]
    (-> this (.getRegion))))

(defn set-interconnect-attachment
  "interconnect-attachment - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionInterconnectAttachmentName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionInterconnectAttachmentName$Builder [^ProjectRegionInterconnectAttachmentName$Builder this ^java.lang.String interconnect-attachment]
    (-> this (.setInterconnectAttachment interconnect-attachment))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionInterconnectAttachmentName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionInterconnectAttachmentName$Builder [^ProjectRegionInterconnectAttachmentName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-region
  "region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionInterconnectAttachmentName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionInterconnectAttachmentName$Builder [^ProjectRegionInterconnectAttachmentName$Builder this ^java.lang.String region]
    (-> this (.setRegion region))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectRegionInterconnectAttachmentName`"
  (^com.google.cloud.compute.v1.ProjectRegionInterconnectAttachmentName [^ProjectRegionInterconnectAttachmentName$Builder this]
    (-> this (.build))))

