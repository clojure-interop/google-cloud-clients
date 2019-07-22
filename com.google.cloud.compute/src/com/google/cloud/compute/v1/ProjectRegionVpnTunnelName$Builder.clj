(ns com.google.cloud.compute.v1.ProjectRegionVpnTunnelName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectRegionVpnTunnelName$Builder]))

(defn ->builder
  "Constructor.

  project-region-vpn-tunnel-name - `com.google.cloud.compute.v1.ProjectRegionVpnTunnelName`"
  (^ProjectRegionVpnTunnelName$Builder [^com.google.cloud.compute.v1.ProjectRegionVpnTunnelName project-region-vpn-tunnel-name]
    (new ProjectRegionVpnTunnelName$Builder project-region-vpn-tunnel-name)))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionVpnTunnelName$Builder this]
    (-> this (.getProject))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionVpnTunnelName$Builder this]
    (-> this (.getRegion))))

(defn get-vpn-tunnel
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionVpnTunnelName$Builder this]
    (-> this (.getVpnTunnel))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionVpnTunnelName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionVpnTunnelName$Builder [^ProjectRegionVpnTunnelName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-region
  "region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionVpnTunnelName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionVpnTunnelName$Builder [^ProjectRegionVpnTunnelName$Builder this ^java.lang.String region]
    (-> this (.setRegion region))))

(defn set-vpn-tunnel
  "vpn-tunnel - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionVpnTunnelName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionVpnTunnelName$Builder [^ProjectRegionVpnTunnelName$Builder this ^java.lang.String vpn-tunnel]
    (-> this (.setVpnTunnel vpn-tunnel))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectRegionVpnTunnelName`"
  (^com.google.cloud.compute.v1.ProjectRegionVpnTunnelName [^ProjectRegionVpnTunnelName$Builder this]
    (-> this (.build))))

