(ns com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupResourceName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectZoneNetworkEndpointGroupResourceName$Builder]))

(defn ->builder
  "Constructor.

  project-zone-network-endpoint-group-resource-name - `com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupResourceName`"
  (^ProjectZoneNetworkEndpointGroupResourceName$Builder [^com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupResourceName project-zone-network-endpoint-group-resource-name]
    (new ProjectZoneNetworkEndpointGroupResourceName$Builder project-zone-network-endpoint-group-resource-name)))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneNetworkEndpointGroupResourceName$Builder this]
    (-> this (.getProject))))

(defn get-resource
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneNetworkEndpointGroupResourceName$Builder this]
    (-> this (.getResource))))

(defn get-zone
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneNetworkEndpointGroupResourceName$Builder this]
    (-> this (.getZone))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupResourceName$Builder [^ProjectZoneNetworkEndpointGroupResourceName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-resource
  "resource - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupResourceName$Builder [^ProjectZoneNetworkEndpointGroupResourceName$Builder this ^java.lang.String resource]
    (-> this (.setResource resource))))

(defn set-zone
  "zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupResourceName$Builder [^ProjectZoneNetworkEndpointGroupResourceName$Builder this ^java.lang.String zone]
    (-> this (.setZone zone))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupResourceName`"
  (^com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupResourceName [^ProjectZoneNetworkEndpointGroupResourceName$Builder this]
    (-> this (.build))))

