(ns com.google.cloud.compute.v1.ProjectRegionTargetVpnGatewayName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectRegionTargetVpnGatewayName$Builder]))

(defn ->builder
  "Constructor.

  project-region-target-vpn-gateway-name - `com.google.cloud.compute.v1.ProjectRegionTargetVpnGatewayName`"
  (^ProjectRegionTargetVpnGatewayName$Builder [^com.google.cloud.compute.v1.ProjectRegionTargetVpnGatewayName project-region-target-vpn-gateway-name]
    (new ProjectRegionTargetVpnGatewayName$Builder project-region-target-vpn-gateway-name)))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionTargetVpnGatewayName$Builder this]
    (-> this (.getProject))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionTargetVpnGatewayName$Builder this]
    (-> this (.getRegion))))

(defn get-target-vpn-gateway
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionTargetVpnGatewayName$Builder this]
    (-> this (.getTargetVpnGateway))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionTargetVpnGatewayName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionTargetVpnGatewayName$Builder [^ProjectRegionTargetVpnGatewayName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-region
  "region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionTargetVpnGatewayName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionTargetVpnGatewayName$Builder [^ProjectRegionTargetVpnGatewayName$Builder this ^java.lang.String region]
    (-> this (.setRegion region))))

(defn set-target-vpn-gateway
  "target-vpn-gateway - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionTargetVpnGatewayName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionTargetVpnGatewayName$Builder [^ProjectRegionTargetVpnGatewayName$Builder this ^java.lang.String target-vpn-gateway]
    (-> this (.setTargetVpnGateway target-vpn-gateway))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectRegionTargetVpnGatewayName`"
  (^com.google.cloud.compute.v1.ProjectRegionTargetVpnGatewayName [^ProjectRegionTargetVpnGatewayName$Builder this]
    (-> this (.build))))

