(ns com.google.cloud.resourcemanager.ResourceManagerOptions$DefaultResourceManagerFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.resourcemanager ResourceManagerOptions$DefaultResourceManagerFactory]))

(defn ->default-resource-manager-factory
  "Constructor."
  (^ResourceManagerOptions$DefaultResourceManagerFactory []
    (new ResourceManagerOptions$DefaultResourceManagerFactory )))

(defn create
  "options - `com.google.cloud.resourcemanager.ResourceManagerOptions`

  returns: `com.google.cloud.resourcemanager.ResourceManager`"
  (^com.google.cloud.resourcemanager.ResourceManager [^ResourceManagerOptions$DefaultResourceManagerFactory this ^com.google.cloud.resourcemanager.ResourceManagerOptions options]
    (-> this (.create options))))

