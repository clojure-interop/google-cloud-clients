(ns com.google.cloud.storage.spi.StorageRpcFactory
  "An interface for Storage RPC factory. Implementation will be loaded via ServiceLoader."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage.spi StorageRpcFactory]))

