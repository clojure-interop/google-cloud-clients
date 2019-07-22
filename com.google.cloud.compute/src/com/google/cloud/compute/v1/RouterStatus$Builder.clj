(ns com.google.cloud.compute.v1.RouterStatus$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RouterStatus$Builder]))

(defn add-all-bgp-peer-status
  "bgp-peer-status - `java.util.List`

  returns: `com.google.cloud.compute.v1.RouterStatus$Builder`"
  (^com.google.cloud.compute.v1.RouterStatus$Builder [^RouterStatus$Builder this ^java.util.List bgp-peer-status]
    (-> this (.addAllBgpPeerStatus bgp-peer-status))))

(defn get-bgp-peer-status-list
  "returns: `java.util.List<com.google.cloud.compute.v1.RouterStatusBgpPeerStatus>`"
  (^java.util.List [^RouterStatus$Builder this]
    (-> this (.getBgpPeerStatusList))))

(defn add-all-best-routes-for-router
  "Best routes learned by this router.

  best-routes-for-router - `java.util.List`

  returns: `com.google.cloud.compute.v1.RouterStatus$Builder`"
  (^com.google.cloud.compute.v1.RouterStatus$Builder [^RouterStatus$Builder this ^java.util.List best-routes-for-router]
    (-> this (.addAllBestRoutesForRouter best-routes-for-router))))

(defn get-best-routes-list
  "Best routes for this router's network.

  returns: `java.util.List<com.google.cloud.compute.v1.Route>`"
  (^java.util.List [^RouterStatus$Builder this]
    (-> this (.getBestRoutesList))))

(defn add-best-routes-for-router
  "Best routes learned by this router.

  best-routes-for-router - `com.google.cloud.compute.v1.Route`

  returns: `com.google.cloud.compute.v1.RouterStatus$Builder`"
  (^com.google.cloud.compute.v1.RouterStatus$Builder [^RouterStatus$Builder this ^com.google.cloud.compute.v1.Route best-routes-for-router]
    (-> this (.addBestRoutesForRouter best-routes-for-router))))

(defn get-nat-status-list
  "returns: `java.util.List<com.google.cloud.compute.v1.RouterStatusNatStatus>`"
  (^java.util.List [^RouterStatus$Builder this]
    (-> this (.getNatStatusList))))

(defn set-network
  "URI of the network to which this router belongs.

  network - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RouterStatus$Builder`"
  (^com.google.cloud.compute.v1.RouterStatus$Builder [^RouterStatus$Builder this ^java.lang.String network]
    (-> this (.setNetwork network))))

(defn add-bgp-peer-status
  "bgp-peer-status - `com.google.cloud.compute.v1.RouterStatusBgpPeerStatus`

  returns: `com.google.cloud.compute.v1.RouterStatus$Builder`"
  (^com.google.cloud.compute.v1.RouterStatus$Builder [^RouterStatus$Builder this ^com.google.cloud.compute.v1.RouterStatusBgpPeerStatus bgp-peer-status]
    (-> this (.addBgpPeerStatus bgp-peer-status))))

(defn build
  "returns: `com.google.cloud.compute.v1.RouterStatus`"
  (^com.google.cloud.compute.v1.RouterStatus [^RouterStatus$Builder this]
    (-> this (.build))))

(defn add-all-best-routes
  "Best routes for this router's network.

  best-routes - `java.util.List`

  returns: `com.google.cloud.compute.v1.RouterStatus$Builder`"
  (^com.google.cloud.compute.v1.RouterStatus$Builder [^RouterStatus$Builder this ^java.util.List best-routes]
    (-> this (.addAllBestRoutes best-routes))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.RouterStatus`

  returns: `com.google.cloud.compute.v1.RouterStatus$Builder`"
  (^com.google.cloud.compute.v1.RouterStatus$Builder [^RouterStatus$Builder this ^com.google.cloud.compute.v1.RouterStatus other]
    (-> this (.mergeFrom other))))

(defn get-best-routes-for-router-list
  "Best routes learned by this router.

  returns: `java.util.List<com.google.cloud.compute.v1.Route>`"
  (^java.util.List [^RouterStatus$Builder this]
    (-> this (.getBestRoutesForRouterList))))

(defn get-network
  "URI of the network to which this router belongs.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterStatus$Builder this]
    (-> this (.getNetwork))))

(defn add-best-routes
  "Best routes for this router's network.

  best-routes - `com.google.cloud.compute.v1.Route`

  returns: `com.google.cloud.compute.v1.RouterStatus$Builder`"
  (^com.google.cloud.compute.v1.RouterStatus$Builder [^RouterStatus$Builder this ^com.google.cloud.compute.v1.Route best-routes]
    (-> this (.addBestRoutes best-routes))))

(defn clone
  "returns: `com.google.cloud.compute.v1.RouterStatus$Builder`"
  (^com.google.cloud.compute.v1.RouterStatus$Builder [^RouterStatus$Builder this]
    (-> this (.clone))))

(defn add-nat-status
  "nat-status - `com.google.cloud.compute.v1.RouterStatusNatStatus`

  returns: `com.google.cloud.compute.v1.RouterStatus$Builder`"
  (^com.google.cloud.compute.v1.RouterStatus$Builder [^RouterStatus$Builder this ^com.google.cloud.compute.v1.RouterStatusNatStatus nat-status]
    (-> this (.addNatStatus nat-status))))

(defn add-all-nat-status
  "nat-status - `java.util.List`

  returns: `com.google.cloud.compute.v1.RouterStatus$Builder`"
  (^com.google.cloud.compute.v1.RouterStatus$Builder [^RouterStatus$Builder this ^java.util.List nat-status]
    (-> this (.addAllNatStatus nat-status))))

