(ns com.google.cloud.resourcemanager.ResourceManagerOptions$DefaultResourceManagerRpcFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.resourcemanager ResourceManagerOptions$DefaultResourceManagerRpcFactory]))

(defn ->default-resource-manager-rpc-factory
  "Constructor."
  (^ResourceManagerOptions$DefaultResourceManagerRpcFactory []
    (new ResourceManagerOptions$DefaultResourceManagerRpcFactory )))

(defn create
  "options - `com.google.cloud.resourcemanager.ResourceManagerOptions`

  returns: `com.google.cloud.ServiceRpc`"
  (^com.google.cloud.ServiceRpc [^ResourceManagerOptions$DefaultResourceManagerRpcFactory this ^com.google.cloud.resourcemanager.ResourceManagerOptions options]
    (-> this (.create options))))

