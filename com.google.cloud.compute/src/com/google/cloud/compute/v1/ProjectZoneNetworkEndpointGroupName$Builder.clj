(ns com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectZoneNetworkEndpointGroupName$Builder]))

(defn ->builder
  "Constructor.

  project-zone-network-endpoint-group-name - `com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupName`"
  (^ProjectZoneNetworkEndpointGroupName$Builder [^com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupName project-zone-network-endpoint-group-name]
    (new ProjectZoneNetworkEndpointGroupName$Builder project-zone-network-endpoint-group-name)))

(defn get-network-endpoint-group
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneNetworkEndpointGroupName$Builder this]
    (-> this (.getNetworkEndpointGroup))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneNetworkEndpointGroupName$Builder this]
    (-> this (.getProject))))

(defn get-zone
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneNetworkEndpointGroupName$Builder this]
    (-> this (.getZone))))

(defn set-network-endpoint-group
  "network-endpoint-group - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupName$Builder [^ProjectZoneNetworkEndpointGroupName$Builder this ^java.lang.String network-endpoint-group]
    (-> this (.setNetworkEndpointGroup network-endpoint-group))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupName$Builder [^ProjectZoneNetworkEndpointGroupName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-zone
  "zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupName$Builder [^ProjectZoneNetworkEndpointGroupName$Builder this ^java.lang.String zone]
    (-> this (.setZone zone))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupName`"
  (^com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupName [^ProjectZoneNetworkEndpointGroupName$Builder this]
    (-> this (.build))))

