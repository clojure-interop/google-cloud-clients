(ns com.google.cloud.compute.v1.PathRule$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 PathRule$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.PathRule`

  returns: `com.google.cloud.compute.v1.PathRule$Builder`"
  (^com.google.cloud.compute.v1.PathRule$Builder [^PathRule$Builder this ^com.google.cloud.compute.v1.PathRule other]
    (-> this (.mergeFrom other))))

(defn get-paths-list
  "The list of path patterns to match. Each must start with / and the only place a * is
   allowed is at the end following a /. The string fed to the path matcher does not include any
   text after the first ? or #, and those chars are not allowed here.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^PathRule$Builder this]
    (-> this (.getPathsList))))

(defn add-all-paths
  "The list of path patterns to match. Each must start with / and the only place a * is
   allowed is at the end following a /. The string fed to the path matcher does not include any
   text after the first ? or #, and those chars are not allowed here.

  paths - `java.util.List`

  returns: `com.google.cloud.compute.v1.PathRule$Builder`"
  (^com.google.cloud.compute.v1.PathRule$Builder [^PathRule$Builder this ^java.util.List paths]
    (-> this (.addAllPaths paths))))

(defn add-paths
  "The list of path patterns to match. Each must start with / and the only place a * is
   allowed is at the end following a /. The string fed to the path matcher does not include any
   text after the first ? or #, and those chars are not allowed here.

  paths - `java.lang.String`

  returns: `com.google.cloud.compute.v1.PathRule$Builder`"
  (^com.google.cloud.compute.v1.PathRule$Builder [^PathRule$Builder this ^java.lang.String paths]
    (-> this (.addPaths paths))))

(defn get-service
  "The full or partial URL of the backend service resource to which traffic is directed if this
   rule is matched. If routeAction is additionally specified, advanced routing actions like URL
   Rewrites, etc. take effect prior to sending the request to the backend. However, if service
   is specified, routeAction cannot contain any weightedBackendService s. Conversely, if
   routeAction specifies any weightedBackendServices, service must not be specified. Only one of
   urlRedirect, service or routeAction.weightedBackendService must be set.

  returns: `java.lang.String`"
  (^java.lang.String [^PathRule$Builder this]
    (-> this (.getService))))

(defn set-service
  "The full or partial URL of the backend service resource to which traffic is directed if this
   rule is matched. If routeAction is additionally specified, advanced routing actions like URL
   Rewrites, etc. take effect prior to sending the request to the backend. However, if service
   is specified, routeAction cannot contain any weightedBackendService s. Conversely, if
   routeAction specifies any weightedBackendServices, service must not be specified. Only one of
   urlRedirect, service or routeAction.weightedBackendService must be set.

  service - `java.lang.String`

  returns: `com.google.cloud.compute.v1.PathRule$Builder`"
  (^com.google.cloud.compute.v1.PathRule$Builder [^PathRule$Builder this ^java.lang.String service]
    (-> this (.setService service))))

(defn build
  "returns: `com.google.cloud.compute.v1.PathRule`"
  (^com.google.cloud.compute.v1.PathRule [^PathRule$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.PathRule$Builder`"
  (^com.google.cloud.compute.v1.PathRule$Builder [^PathRule$Builder this]
    (-> this (.clone))))

