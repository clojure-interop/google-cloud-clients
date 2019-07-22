(ns com.google.cloud.iot.v1.stub.DeviceManagerStubSettings
  "Settings class to configure an instance of DeviceManagerStub.

  The default instance has everything set to sensible defaults:


    The default service address (cloudiot.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of createDeviceRegistry to 30 seconds:



  DeviceManagerStubSettings.Builder deviceManagerSettingsBuilder =
      DeviceManagerStubSettings.newBuilder();
  deviceManagerSettingsBuilder.createDeviceRegistrySettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  DeviceManagerStubSettings deviceManagerSettings = deviceManagerSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.iot.v1.stub DeviceManagerStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (DeviceManagerStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (DeviceManagerStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (DeviceManagerStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (DeviceManagerStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (DeviceManagerStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (DeviceManagerStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (DeviceManagerStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.iot.v1.stub.DeviceManagerStubSettings$Builder`"
  (^com.google.cloud.iot.v1.stub.DeviceManagerStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (DeviceManagerStubSettings/newBuilder client-context))
  (^com.google.cloud.iot.v1.stub.DeviceManagerStubSettings$Builder []
    (DeviceManagerStubSettings/newBuilder )))

(defn list-device-states-settings
  "Returns the object with the settings used for calls to listDeviceStates.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.iot.v1.ListDeviceStatesRequest,com.google.cloud.iot.v1.ListDeviceStatesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DeviceManagerStubSettings this]
    (-> this (.listDeviceStatesSettings))))

(defn list-device-registries-settings
  "Returns the object with the settings used for calls to listDeviceRegistries.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.iot.v1.ListDeviceRegistriesRequest,com.google.cloud.iot.v1.ListDeviceRegistriesResponse,com.google.cloud.iot.v1.DeviceManagerClient$ListDeviceRegistriesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^DeviceManagerStubSettings this]
    (-> this (.listDeviceRegistriesSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.iot.v1.stub.DeviceManagerStub`

  throws: java.io.IOException"
  ([^DeviceManagerStubSettings this]
    (-> this (.createStub))))

(defn modify-cloud-to-device-config-settings
  "Returns the object with the settings used for calls to modifyCloudToDeviceConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.iot.v1.ModifyCloudToDeviceConfigRequest,com.google.cloud.iot.v1.DeviceConfig>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DeviceManagerStubSettings this]
    (-> this (.modifyCloudToDeviceConfigSettings))))

(defn get-device-registry-settings
  "Returns the object with the settings used for calls to getDeviceRegistry.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.iot.v1.GetDeviceRegistryRequest,com.google.cloud.iot.v1.DeviceRegistry>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DeviceManagerStubSettings this]
    (-> this (.getDeviceRegistrySettings))))

(defn test-iam-permissions-settings
  "Returns the object with the settings used for calls to testIamPermissions.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DeviceManagerStubSettings this]
    (-> this (.testIamPermissionsSettings))))

(defn bind-device-to-gateway-settings
  "Returns the object with the settings used for calls to bindDeviceToGateway.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.iot.v1.BindDeviceToGatewayRequest,com.google.cloud.iot.v1.BindDeviceToGatewayResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DeviceManagerStubSettings this]
    (-> this (.bindDeviceToGatewaySettings))))

(defn set-iam-policy-settings
  "Returns the object with the settings used for calls to setIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DeviceManagerStubSettings this]
    (-> this (.setIamPolicySettings))))

(defn get-device-settings
  "Returns the object with the settings used for calls to getDevice.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.iot.v1.GetDeviceRequest,com.google.cloud.iot.v1.Device>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DeviceManagerStubSettings this]
    (-> this (.getDeviceSettings))))

(defn list-devices-settings
  "Returns the object with the settings used for calls to listDevices.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.iot.v1.ListDevicesRequest,com.google.cloud.iot.v1.ListDevicesResponse,com.google.cloud.iot.v1.DeviceManagerClient$ListDevicesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^DeviceManagerStubSettings this]
    (-> this (.listDevicesSettings))))

(defn create-device-settings
  "Returns the object with the settings used for calls to createDevice.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.iot.v1.CreateDeviceRequest,com.google.cloud.iot.v1.Device>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DeviceManagerStubSettings this]
    (-> this (.createDeviceSettings))))

(defn unbind-device-from-gateway-settings
  "Returns the object with the settings used for calls to unbindDeviceFromGateway.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.iot.v1.UnbindDeviceFromGatewayRequest,com.google.cloud.iot.v1.UnbindDeviceFromGatewayResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DeviceManagerStubSettings this]
    (-> this (.unbindDeviceFromGatewaySettings))))

(defn update-device-settings
  "Returns the object with the settings used for calls to updateDevice.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.iot.v1.UpdateDeviceRequest,com.google.cloud.iot.v1.Device>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DeviceManagerStubSettings this]
    (-> this (.updateDeviceSettings))))

(defn delete-device-registry-settings
  "Returns the object with the settings used for calls to deleteDeviceRegistry.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.iot.v1.DeleteDeviceRegistryRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DeviceManagerStubSettings this]
    (-> this (.deleteDeviceRegistrySettings))))

(defn get-iam-policy-settings
  "Returns the object with the settings used for calls to getIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DeviceManagerStubSettings this]
    (-> this (.getIamPolicySettings))))

(defn create-device-registry-settings
  "Returns the object with the settings used for calls to createDeviceRegistry.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.iot.v1.CreateDeviceRegistryRequest,com.google.cloud.iot.v1.DeviceRegistry>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DeviceManagerStubSettings this]
    (-> this (.createDeviceRegistrySettings))))

(defn delete-device-settings
  "Returns the object with the settings used for calls to deleteDevice.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.iot.v1.DeleteDeviceRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DeviceManagerStubSettings this]
    (-> this (.deleteDeviceSettings))))

(defn list-device-config-versions-settings
  "Returns the object with the settings used for calls to listDeviceConfigVersions.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.iot.v1.ListDeviceConfigVersionsRequest,com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DeviceManagerStubSettings this]
    (-> this (.listDeviceConfigVersionsSettings))))

(defn send-command-to-device-settings
  "Returns the object with the settings used for calls to sendCommandToDevice.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.iot.v1.SendCommandToDeviceRequest,com.google.cloud.iot.v1.SendCommandToDeviceResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DeviceManagerStubSettings this]
    (-> this (.sendCommandToDeviceSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.iot.v1.stub.DeviceManagerStubSettings$Builder`"
  (^com.google.cloud.iot.v1.stub.DeviceManagerStubSettings$Builder [^DeviceManagerStubSettings this]
    (-> this (.toBuilder))))

(defn update-device-registry-settings
  "Returns the object with the settings used for calls to updateDeviceRegistry.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.iot.v1.UpdateDeviceRegistryRequest,com.google.cloud.iot.v1.DeviceRegistry>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DeviceManagerStubSettings this]
    (-> this (.updateDeviceRegistrySettings))))

