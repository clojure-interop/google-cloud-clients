(ns com.google.cloud.iot.v1.DeviceManagerClient
  "Service Description: Internet of Things (IoT) service. Securely connect and manage IoT devices.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
    LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
    DeviceRegistry deviceRegistry = DeviceRegistry.newBuilder().build();
    DeviceRegistry response = deviceManagerClient.createDeviceRegistry(parent, deviceRegistry);
  }

  Note: close() needs to be called on the deviceManagerClient object to clean up resources such
  as threads. In the example above, try-with-resources is used, which automatically calls close().

  The surface of this class includes several types of Java methods for each of the API's
  methods:


    A \"flattened\" method. With this type of method, the fields of the request type have been
        converted into function parameters. It may be the case that not all fields are available as
        parameters, and not every API method will have a flattened method entry point.
    A \"request object\" method. This type of method only takes one parameter, a request object,
        which must be constructed before the call. Not every API method will have a request object
        method.
    A \"callable\" method. This type of method takes no parameters and returns an immutable API
        callable object, which can be used to initiate calls to the service.


  See the individual methods for example code.

  Many parameters require resource names to be formatted in a particular way. To assist with
  these names, this class includes a format method for each type of name, and additionally a parse
  method to extract the individual identifiers contained within names that are returned.

  This class can be customized by passing in a custom instance of DeviceManagerSettings to
  create(). For example:

  To customize credentials:



  DeviceManagerSettings deviceManagerSettings =
      DeviceManagerSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  DeviceManagerClient deviceManagerClient =
      DeviceManagerClient.create(deviceManagerSettings);

  To customize the endpoint:



  DeviceManagerSettings deviceManagerSettings =
      DeviceManagerSettings.newBuilder().setEndpoint(myEndpoint).build();
  DeviceManagerClient deviceManagerClient =
      DeviceManagerClient.create(deviceManagerSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.iot.v1 DeviceManagerClient]))

(defn *create
  "Constructs an instance of DeviceManagerClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.iot.v1.DeviceManagerSettings`

  returns: `com.google.cloud.iot.v1.DeviceManagerClient`

  throws: java.io.IOException"
  (^com.google.cloud.iot.v1.DeviceManagerClient [^com.google.cloud.iot.v1.DeviceManagerSettings settings]
    (DeviceManagerClient/create settings))
  (^com.google.cloud.iot.v1.DeviceManagerClient []
    (DeviceManagerClient/create )))

(defn bind-device-to-gateway-callable
  "Associates the device with the gateway.

   Sample code:



   try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
     RegistryName parent = RegistryName.of(\"[PROJECT]\", \"[LOCATION]\", \"[REGISTRY]\");
     String gatewayId = \"\";
     String deviceId = \"\";
     BindDeviceToGatewayRequest request = BindDeviceToGatewayRequest.newBuilder()
       .setParent(parent.toString())
       .setGatewayId(gatewayId)
       .setDeviceId(deviceId)
       .build();
     ApiFuture<BindDeviceToGatewayResponse> future = deviceManagerClient.bindDeviceToGatewayCallable().futureCall(request);
     // Do something
     BindDeviceToGatewayResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.BindDeviceToGatewayRequest,com.google.cloud.iot.v1.BindDeviceToGatewayResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DeviceManagerClient this]
    (-> this (.bindDeviceToGatewayCallable))))

(defn update-device-registry
  "Updates a device registry configuration.

   Sample code:



   try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
     DeviceRegistry deviceRegistry = DeviceRegistry.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     DeviceRegistry response = deviceManagerClient.updateDeviceRegistry(deviceRegistry, updateMask);
   }

  device-registry - The new values for the device registry. The `id` field must be empty, and the `name` field must indicate the path of the resource. For example, `projects/example-project/locations/us-central1/registries/my-registry`. - `com.google.cloud.iot.v1.DeviceRegistry`
  update-mask - Only updates the `device_registry` fields indicated by this mask. The field mask must not be empty, and it must not contain fields that are immutable or only set by the server. Mutable top-level fields: `event_notification_config`, `http_config`, `mqtt_config`, and `state_notification_config`. - `com.google.protobuf.FieldMask`

  returns: `com.google.cloud.iot.v1.DeviceRegistry`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.iot.v1.DeviceRegistry [^DeviceManagerClient this ^com.google.cloud.iot.v1.DeviceRegistry device-registry ^com.google.protobuf.FieldMask update-mask]
    (-> this (.updateDeviceRegistry device-registry update-mask)))
  (^com.google.cloud.iot.v1.DeviceRegistry [^DeviceManagerClient this ^com.google.cloud.iot.v1.UpdateDeviceRegistryRequest request]
    (-> this (.updateDeviceRegistry request))))

(defn unbind-device-from-gateway
  "Deletes the association between the device and the gateway.

   Sample code:



   try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
     RegistryName parent = RegistryName.of(\"[PROJECT]\", \"[LOCATION]\", \"[REGISTRY]\");
     String gatewayId = \"\";
     String deviceId = \"\";
     UnbindDeviceFromGatewayResponse response = deviceManagerClient.unbindDeviceFromGateway(parent, gatewayId, deviceId);
   }

  parent - The name of the registry. For example, `projects/example-project/locations/us-central1/registries/my-registry`. - `com.google.cloud.iot.v1.RegistryName`
  gateway-id - The value of `gateway_id` can be either the device numeric ID or the user-defined device identifier. - `java.lang.String`
  device-id - The device to disassociate from the specified gateway. The value of `device_id` can be either the device numeric ID or the user-defined device identifier. - `java.lang.String`

  returns: `com.google.cloud.iot.v1.UnbindDeviceFromGatewayResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.iot.v1.UnbindDeviceFromGatewayResponse [^DeviceManagerClient this ^com.google.cloud.iot.v1.RegistryName parent ^java.lang.String gateway-id ^java.lang.String device-id]
    (-> this (.unbindDeviceFromGateway parent gateway-id device-id)))
  (^com.google.cloud.iot.v1.UnbindDeviceFromGatewayResponse [^DeviceManagerClient this ^com.google.cloud.iot.v1.UnbindDeviceFromGatewayRequest request]
    (-> this (.unbindDeviceFromGateway request))))

(defn list-device-config-versions
  "Lists the last few versions of the device configuration in descending order (i.e.: newest
   first).

   Sample code:



   try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
     DeviceName name = DeviceName.of(\"[PROJECT]\", \"[LOCATION]\", \"[REGISTRY]\", \"[DEVICE]\");
     ListDeviceConfigVersionsResponse response = deviceManagerClient.listDeviceConfigVersions(name);
   }

  name - The name of the device. For example, `projects/p0/locations/us-central1/registries/registry0/devices/device0` or `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`. - `com.google.cloud.iot.v1.DeviceName`

  returns: `com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse [^DeviceManagerClient this ^com.google.cloud.iot.v1.DeviceName name]
    (-> this (.listDeviceConfigVersions name))))

(defn get-iam-policy-callable
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists
   and does not have a policy set.

   Sample code:



   try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
     ResourceName resource = RegistryName.of(\"[PROJECT]\", \"[LOCATION]\", \"[REGISTRY]\");
     GetIamPolicyRequest request = GetIamPolicyRequest.newBuilder()
       .setResource(resource.toString())
       .build();
     ApiFuture<Policy> future = deviceManagerClient.getIamPolicyCallable().futureCall(request);
     // Do something
     Policy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DeviceManagerClient this]
    (-> this (.getIamPolicyCallable))))

(defn list-device-states-callable
  "Lists the last few versions of the device state in descending order (i.e.: newest first).

   Sample code:



   try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
     DeviceName name = DeviceName.of(\"[PROJECT]\", \"[LOCATION]\", \"[REGISTRY]\", \"[DEVICE]\");
     ListDeviceStatesRequest request = ListDeviceStatesRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<ListDeviceStatesResponse> future = deviceManagerClient.listDeviceStatesCallable().futureCall(request);
     // Do something
     ListDeviceStatesResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.ListDeviceStatesRequest,com.google.cloud.iot.v1.ListDeviceStatesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DeviceManagerClient this]
    (-> this (.listDeviceStatesCallable))))

(defn set-iam-policy
  "Sets the access control policy on the specified resource. Replaces any existing policy.

   Sample code:



   try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
     RegistryName resource = RegistryName.of(\"[PROJECT]\", \"[LOCATION]\", \"[REGISTRY]\");
     Policy policy = Policy.newBuilder().build();
     Policy response = deviceManagerClient.setIamPolicy(resource, policy);
   }

  resource - REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field. - `com.google.cloud.iot.v1.RegistryName`
  policy - REQUIRED: The complete policy to be applied to the `resource`. The size of the policy is limited to a few 10s of KB. An empty policy is a valid policy but certain Cloud Platform services (such as Projects) might reject them. - `com.google.iam.v1.Policy`

  returns: `com.google.iam.v1.Policy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.iam.v1.Policy [^DeviceManagerClient this ^com.google.cloud.iot.v1.RegistryName resource ^com.google.iam.v1.Policy policy]
    (-> this (.setIamPolicy resource policy)))
  (^com.google.iam.v1.Policy [^DeviceManagerClient this ^com.google.iam.v1.SetIamPolicyRequest request]
    (-> this (.setIamPolicy request))))

(defn create-device-callable
  "Creates a device in a device registry.

   Sample code:



   try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
     RegistryName parent = RegistryName.of(\"[PROJECT]\", \"[LOCATION]\", \"[REGISTRY]\");
     Device device = Device.newBuilder().build();
     CreateDeviceRequest request = CreateDeviceRequest.newBuilder()
       .setParent(parent.toString())
       .setDevice(device)
       .build();
     ApiFuture<Device> future = deviceManagerClient.createDeviceCallable().futureCall(request);
     // Do something
     Device response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.CreateDeviceRequest,com.google.cloud.iot.v1.Device>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DeviceManagerClient this]
    (-> this (.createDeviceCallable))))

(defn create-device-registry
  "Creates a device registry that contains devices.

   Sample code:



   try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     DeviceRegistry deviceRegistry = DeviceRegistry.newBuilder().build();
     DeviceRegistry response = deviceManagerClient.createDeviceRegistry(parent, deviceRegistry);
   }

  parent - The project and cloud region where this device registry must be created. For example, `projects/example-project/locations/us-central1`. - `com.google.cloud.iot.v1.LocationName`
  device-registry - The device registry. The field `name` must be empty. The server will generate that field from the device registry `id` provided and the `parent` field. - `com.google.cloud.iot.v1.DeviceRegistry`

  returns: `com.google.cloud.iot.v1.DeviceRegistry`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.iot.v1.DeviceRegistry [^DeviceManagerClient this ^com.google.cloud.iot.v1.LocationName parent ^com.google.cloud.iot.v1.DeviceRegistry device-registry]
    (-> this (.createDeviceRegistry parent device-registry)))
  (^com.google.cloud.iot.v1.DeviceRegistry [^DeviceManagerClient this ^com.google.cloud.iot.v1.CreateDeviceRegistryRequest request]
    (-> this (.createDeviceRegistry request))))

(defn get-settings
  "returns: `com.google.cloud.iot.v1.DeviceManagerSettings`"
  (^com.google.cloud.iot.v1.DeviceManagerSettings [^DeviceManagerClient this]
    (-> this (.getSettings))))

(defn delete-device
  "Deletes a device.

   Sample code:



   try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
     DeviceName name = DeviceName.of(\"[PROJECT]\", \"[LOCATION]\", \"[REGISTRY]\", \"[DEVICE]\");
     deviceManagerClient.deleteDevice(name);
   }

  name - The name of the device. For example, `projects/p0/locations/us-central1/registries/registry0/devices/device0` or `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`. - `com.google.cloud.iot.v1.DeviceName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^DeviceManagerClient this ^com.google.cloud.iot.v1.DeviceName name]
    (-> this (.deleteDevice name))))

(defn list-devices-paged-callable
  "List devices in a device registry.

   Sample code:



   try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
     RegistryName parent = RegistryName.of(\"[PROJECT]\", \"[LOCATION]\", \"[REGISTRY]\");
     ListDevicesRequest request = ListDevicesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListDevicesPagedResponse> future = deviceManagerClient.listDevicesPagedCallable().futureCall(request);
     // Do something
     for (Device element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.ListDevicesRequest,com.google.cloud.iot.v1.DeviceManagerClient$ListDevicesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DeviceManagerClient this]
    (-> this (.listDevicesPagedCallable))))

(defn list-device-registries-callable
  "Lists device registries.

   Sample code:



   try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     ListDeviceRegistriesRequest request = ListDeviceRegistriesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListDeviceRegistriesResponse response = deviceManagerClient.listDeviceRegistriesCallable().call(request);
       for (DeviceRegistry element : response.getDeviceRegistriesList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.ListDeviceRegistriesRequest,com.google.cloud.iot.v1.ListDeviceRegistriesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DeviceManagerClient this]
    (-> this (.listDeviceRegistriesCallable))))

(defn delete-device-registry
  "Deletes a device registry configuration.

   Sample code:



   try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
     RegistryName name = RegistryName.of(\"[PROJECT]\", \"[LOCATION]\", \"[REGISTRY]\");
     deviceManagerClient.deleteDeviceRegistry(name);
   }

  name - The name of the device registry. For example, `projects/example-project/locations/us-central1/registries/my-registry`. - `com.google.cloud.iot.v1.RegistryName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^DeviceManagerClient this ^com.google.cloud.iot.v1.RegistryName name]
    (-> this (.deleteDeviceRegistry name))))

(defn list-device-registries
  "Lists device registries.

   Sample code:



   try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     for (DeviceRegistry element : deviceManagerClient.listDeviceRegistries(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - The project and cloud region path. For example, `projects/example-project/locations/us-central1`. - `com.google.cloud.iot.v1.LocationName`

  returns: `com.google.cloud.iot.v1.DeviceManagerClient$ListDeviceRegistriesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.iot.v1.DeviceManagerClient$ListDeviceRegistriesPagedResponse [^DeviceManagerClient this ^com.google.cloud.iot.v1.LocationName parent]
    (-> this (.listDeviceRegistries parent))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.iot.v1.stub.DeviceManagerStub`"
  ([^DeviceManagerClient this]
    (-> this (.getStub))))

(defn list-devices
  "List devices in a device registry.

   Sample code:



   try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
     RegistryName parent = RegistryName.of(\"[PROJECT]\", \"[LOCATION]\", \"[REGISTRY]\");
     for (Device element : deviceManagerClient.listDevices(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - The device registry path. Required. For example, `projects/my-project/locations/us-central1/registries/my-registry`. - `com.google.cloud.iot.v1.RegistryName`

  returns: `com.google.cloud.iot.v1.DeviceManagerClient$ListDevicesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.iot.v1.DeviceManagerClient$ListDevicesPagedResponse [^DeviceManagerClient this ^com.google.cloud.iot.v1.RegistryName parent]
    (-> this (.listDevices parent))))

(defn delete-device-callable
  "Deletes a device.

   Sample code:



   try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
     DeviceName name = DeviceName.of(\"[PROJECT]\", \"[LOCATION]\", \"[REGISTRY]\", \"[DEVICE]\");
     DeleteDeviceRequest request = DeleteDeviceRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = deviceManagerClient.deleteDeviceCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.DeleteDeviceRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DeviceManagerClient this]
    (-> this (.deleteDeviceCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^DeviceManagerClient this]
    (-> this (.isShutdown))))

(defn modify-cloud-to-device-config
  "Modifies the configuration for the device, which is eventually sent from the Cloud IoT Core
   servers. Returns the modified configuration version and its metadata.

   Sample code:



   try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
     DeviceName name = DeviceName.of(\"[PROJECT]\", \"[LOCATION]\", \"[REGISTRY]\", \"[DEVICE]\");
     ByteString binaryData = ByteString.copyFromUtf8(\"\");
     DeviceConfig response = deviceManagerClient.modifyCloudToDeviceConfig(name, binaryData);
   }

  name - The name of the device. For example, `projects/p0/locations/us-central1/registries/registry0/devices/device0` or `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`. - `com.google.cloud.iot.v1.DeviceName`
  binary-data - The configuration data for the device. - `com.google.protobuf.ByteString`

  returns: `com.google.cloud.iot.v1.DeviceConfig`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.iot.v1.DeviceConfig [^DeviceManagerClient this ^com.google.cloud.iot.v1.DeviceName name ^com.google.protobuf.ByteString binary-data]
    (-> this (.modifyCloudToDeviceConfig name binary-data)))
  (^com.google.cloud.iot.v1.DeviceConfig [^DeviceManagerClient this ^com.google.cloud.iot.v1.ModifyCloudToDeviceConfigRequest request]
    (-> this (.modifyCloudToDeviceConfig request))))

(defn send-command-to-device-callable
  "Sends a command to the specified device. In order for a device to be able to receive commands,
   it must: 1) be connected to Cloud IoT Core using the MQTT protocol, and 2) be subscribed to the
   group of MQTT topics specified by /devices/{device-id}/commands/#. This subscription will
   receive commands at the top-level topic /devices/{device-id}/commands as well as commands for
   subfolders, like /devices/{device-id}/commands/subfolder. Note that subscribing to specific
   subfolders is not supported. If the command could not be delivered to the device, this method
   will return an error; in particular, if the device is not subscribed, this method will return
   FAILED_PRECONDITION. Otherwise, this method will return OK. If the subscription is QoS 1, at
   least once delivery will be guaranteed; for QoS 0, no acknowledgment will be expected from the
   device.

   Sample code:



   try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
     DeviceName name = DeviceName.of(\"[PROJECT]\", \"[LOCATION]\", \"[REGISTRY]\", \"[DEVICE]\");
     ByteString binaryData = ByteString.copyFromUtf8(\"\");
     SendCommandToDeviceRequest request = SendCommandToDeviceRequest.newBuilder()
       .setName(name.toString())
       .setBinaryData(binaryData)
       .build();
     ApiFuture<SendCommandToDeviceResponse> future = deviceManagerClient.sendCommandToDeviceCallable().futureCall(request);
     // Do something
     SendCommandToDeviceResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.SendCommandToDeviceRequest,com.google.cloud.iot.v1.SendCommandToDeviceResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DeviceManagerClient this]
    (-> this (.sendCommandToDeviceCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^DeviceManagerClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn list-device-registries-paged-callable
  "Lists device registries.

   Sample code:



   try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     ListDeviceRegistriesRequest request = ListDeviceRegistriesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListDeviceRegistriesPagedResponse> future = deviceManagerClient.listDeviceRegistriesPagedCallable().futureCall(request);
     // Do something
     for (DeviceRegistry element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.ListDeviceRegistriesRequest,com.google.cloud.iot.v1.DeviceManagerClient$ListDeviceRegistriesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DeviceManagerClient this]
    (-> this (.listDeviceRegistriesPagedCallable))))

(defn shutdown
  ""
  ([^DeviceManagerClient this]
    (-> this (.shutdown))))

(defn get-device-registry
  "Gets a device registry configuration.

   Sample code:



   try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
     RegistryName name = RegistryName.of(\"[PROJECT]\", \"[LOCATION]\", \"[REGISTRY]\");
     DeviceRegistry response = deviceManagerClient.getDeviceRegistry(name);
   }

  name - The name of the device registry. For example, `projects/example-project/locations/us-central1/registries/my-registry`. - `com.google.cloud.iot.v1.RegistryName`

  returns: `com.google.cloud.iot.v1.DeviceRegistry`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.iot.v1.DeviceRegistry [^DeviceManagerClient this ^com.google.cloud.iot.v1.RegistryName name]
    (-> this (.getDeviceRegistry name))))

(defn bind-device-to-gateway
  "Associates the device with the gateway.

   Sample code:



   try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
     RegistryName parent = RegistryName.of(\"[PROJECT]\", \"[LOCATION]\", \"[REGISTRY]\");
     String gatewayId = \"\";
     String deviceId = \"\";
     BindDeviceToGatewayResponse response = deviceManagerClient.bindDeviceToGateway(parent, gatewayId, deviceId);
   }

  parent - The name of the registry. For example, `projects/example-project/locations/us-central1/registries/my-registry`. - `com.google.cloud.iot.v1.RegistryName`
  gateway-id - The value of `gateway_id` can be either the device numeric ID or the user-defined device identifier. - `java.lang.String`
  device-id - The device to associate with the specified gateway. The value of `device_id` can be either the device numeric ID or the user-defined device identifier. - `java.lang.String`

  returns: `com.google.cloud.iot.v1.BindDeviceToGatewayResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.iot.v1.BindDeviceToGatewayResponse [^DeviceManagerClient this ^com.google.cloud.iot.v1.RegistryName parent ^java.lang.String gateway-id ^java.lang.String device-id]
    (-> this (.bindDeviceToGateway parent gateway-id device-id)))
  (^com.google.cloud.iot.v1.BindDeviceToGatewayResponse [^DeviceManagerClient this ^com.google.cloud.iot.v1.BindDeviceToGatewayRequest request]
    (-> this (.bindDeviceToGateway request))))

(defn get-device
  "Gets details about a device.

   Sample code:



   try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
     DeviceName name = DeviceName.of(\"[PROJECT]\", \"[LOCATION]\", \"[REGISTRY]\", \"[DEVICE]\");
     Device response = deviceManagerClient.getDevice(name);
   }

  name - The name of the device. For example, `projects/p0/locations/us-central1/registries/registry0/devices/device0` or `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`. - `com.google.cloud.iot.v1.DeviceName`

  returns: `com.google.cloud.iot.v1.Device`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.iot.v1.Device [^DeviceManagerClient this ^com.google.cloud.iot.v1.DeviceName name]
    (-> this (.getDevice name))))

(defn unbind-device-from-gateway-callable
  "Deletes the association between the device and the gateway.

   Sample code:



   try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
     RegistryName parent = RegistryName.of(\"[PROJECT]\", \"[LOCATION]\", \"[REGISTRY]\");
     String gatewayId = \"\";
     String deviceId = \"\";
     UnbindDeviceFromGatewayRequest request = UnbindDeviceFromGatewayRequest.newBuilder()
       .setParent(parent.toString())
       .setGatewayId(gatewayId)
       .setDeviceId(deviceId)
       .build();
     ApiFuture<UnbindDeviceFromGatewayResponse> future = deviceManagerClient.unbindDeviceFromGatewayCallable().futureCall(request);
     // Do something
     UnbindDeviceFromGatewayResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.UnbindDeviceFromGatewayRequest,com.google.cloud.iot.v1.UnbindDeviceFromGatewayResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DeviceManagerClient this]
    (-> this (.unbindDeviceFromGatewayCallable))))

(defn set-iam-policy-callable
  "Sets the access control policy on the specified resource. Replaces any existing policy.

   Sample code:



   try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
     ResourceName resource = RegistryName.of(\"[PROJECT]\", \"[LOCATION]\", \"[REGISTRY]\");
     Policy policy = Policy.newBuilder().build();
     SetIamPolicyRequest request = SetIamPolicyRequest.newBuilder()
       .setResource(resource.toString())
       .setPolicy(policy)
       .build();
     ApiFuture<Policy> future = deviceManagerClient.setIamPolicyCallable().futureCall(request);
     // Do something
     Policy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DeviceManagerClient this]
    (-> this (.setIamPolicyCallable))))

(defn send-command-to-device
  "Sends a command to the specified device. In order for a device to be able to receive commands,
   it must: 1) be connected to Cloud IoT Core using the MQTT protocol, and 2) be subscribed to the
   group of MQTT topics specified by /devices/{device-id}/commands/#. This subscription will
   receive commands at the top-level topic /devices/{device-id}/commands as well as commands for
   subfolders, like /devices/{device-id}/commands/subfolder. Note that subscribing to specific
   subfolders is not supported. If the command could not be delivered to the device, this method
   will return an error; in particular, if the device is not subscribed, this method will return
   FAILED_PRECONDITION. Otherwise, this method will return OK. If the subscription is QoS 1, at
   least once delivery will be guaranteed; for QoS 0, no acknowledgment will be expected from the
   device.

   Sample code:



   try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
     DeviceName name = DeviceName.of(\"[PROJECT]\", \"[LOCATION]\", \"[REGISTRY]\", \"[DEVICE]\");
     ByteString binaryData = ByteString.copyFromUtf8(\"\");
     String subfolder = \"\";
     SendCommandToDeviceResponse response = deviceManagerClient.sendCommandToDevice(name, binaryData, subfolder);
   }

  name - The name of the device. For example, `projects/p0/locations/us-central1/registries/registry0/devices/device0` or `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`. - `com.google.cloud.iot.v1.DeviceName`
  binary-data - The command data to send to the device. - `com.google.protobuf.ByteString`
  subfolder - Optional subfolder for the command. If empty, the command will be delivered to the /devices/{device-id}/commands topic, otherwise it will be delivered to the /devices/{device-id}/commands/{subfolder} topic. Multi-level subfolders are allowed. This field must not have more than 256 characters, and must not contain any MQTT wildcards (\"+\" or \"#\") or null characters. - `java.lang.String`

  returns: `com.google.cloud.iot.v1.SendCommandToDeviceResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.iot.v1.SendCommandToDeviceResponse [^DeviceManagerClient this ^com.google.cloud.iot.v1.DeviceName name ^com.google.protobuf.ByteString binary-data ^java.lang.String subfolder]
    (-> this (.sendCommandToDevice name binary-data subfolder)))
  (^com.google.cloud.iot.v1.SendCommandToDeviceResponse [^DeviceManagerClient this ^com.google.cloud.iot.v1.SendCommandToDeviceRequest request]
    (-> this (.sendCommandToDevice request))))

(defn list-device-config-versions-callable
  "Lists the last few versions of the device configuration in descending order (i.e.: newest
   first).

   Sample code:



   try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
     DeviceName name = DeviceName.of(\"[PROJECT]\", \"[LOCATION]\", \"[REGISTRY]\", \"[DEVICE]\");
     ListDeviceConfigVersionsRequest request = ListDeviceConfigVersionsRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<ListDeviceConfigVersionsResponse> future = deviceManagerClient.listDeviceConfigVersionsCallable().futureCall(request);
     // Do something
     ListDeviceConfigVersionsResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.ListDeviceConfigVersionsRequest,com.google.cloud.iot.v1.ListDeviceConfigVersionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DeviceManagerClient this]
    (-> this (.listDeviceConfigVersionsCallable))))

(defn close
  ""
  ([^DeviceManagerClient this]
    (-> this (.close))))

(defn test-iam-permissions-callable
  "Returns permissions that a caller has on the specified resource. If the resource does not
   exist, this will return an empty set of permissions, not a NOT_FOUND error.

   Sample code:



   try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
     ResourceName resource = RegistryName.of(\"[PROJECT]\", \"[LOCATION]\", \"[REGISTRY]\");
     List<String> permissions = new ArrayList<>();
     TestIamPermissionsRequest request = TestIamPermissionsRequest.newBuilder()
       .setResource(resource.toString())
       .addAllPermissions(permissions)
       .build();
     ApiFuture<TestIamPermissionsResponse> future = deviceManagerClient.testIamPermissionsCallable().futureCall(request);
     // Do something
     TestIamPermissionsResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DeviceManagerClient this]
    (-> this (.testIamPermissionsCallable))))

(defn get-device-registry-callable
  "Gets a device registry configuration.

   Sample code:



   try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
     RegistryName name = RegistryName.of(\"[PROJECT]\", \"[LOCATION]\", \"[REGISTRY]\");
     GetDeviceRegistryRequest request = GetDeviceRegistryRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<DeviceRegistry> future = deviceManagerClient.getDeviceRegistryCallable().futureCall(request);
     // Do something
     DeviceRegistry response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.GetDeviceRegistryRequest,com.google.cloud.iot.v1.DeviceRegistry>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DeviceManagerClient this]
    (-> this (.getDeviceRegistryCallable))))

(defn get-iam-policy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists
   and does not have a policy set.

   Sample code:



   try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
     RegistryName resource = RegistryName.of(\"[PROJECT]\", \"[LOCATION]\", \"[REGISTRY]\");
     Policy response = deviceManagerClient.getIamPolicy(resource);
   }

  resource - REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field. - `com.google.cloud.iot.v1.RegistryName`

  returns: `com.google.iam.v1.Policy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.iam.v1.Policy [^DeviceManagerClient this ^com.google.cloud.iot.v1.RegistryName resource]
    (-> this (.getIamPolicy resource))))

(defn list-devices-callable
  "List devices in a device registry.

   Sample code:



   try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
     RegistryName parent = RegistryName.of(\"[PROJECT]\", \"[LOCATION]\", \"[REGISTRY]\");
     ListDevicesRequest request = ListDevicesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListDevicesResponse response = deviceManagerClient.listDevicesCallable().call(request);
       for (Device element : response.getDevicesList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.ListDevicesRequest,com.google.cloud.iot.v1.ListDevicesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DeviceManagerClient this]
    (-> this (.listDevicesCallable))))

(defn get-device-callable
  "Gets details about a device.

   Sample code:



   try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
     DeviceName name = DeviceName.of(\"[PROJECT]\", \"[LOCATION]\", \"[REGISTRY]\", \"[DEVICE]\");
     GetDeviceRequest request = GetDeviceRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Device> future = deviceManagerClient.getDeviceCallable().futureCall(request);
     // Do something
     Device response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.GetDeviceRequest,com.google.cloud.iot.v1.Device>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DeviceManagerClient this]
    (-> this (.getDeviceCallable))))

(defn update-device-registry-callable
  "Updates a device registry configuration.

   Sample code:



   try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
     DeviceRegistry deviceRegistry = DeviceRegistry.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     UpdateDeviceRegistryRequest request = UpdateDeviceRegistryRequest.newBuilder()
       .setDeviceRegistry(deviceRegistry)
       .setUpdateMask(updateMask)
       .build();
     ApiFuture<DeviceRegistry> future = deviceManagerClient.updateDeviceRegistryCallable().futureCall(request);
     // Do something
     DeviceRegistry response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.UpdateDeviceRegistryRequest,com.google.cloud.iot.v1.DeviceRegistry>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DeviceManagerClient this]
    (-> this (.updateDeviceRegistryCallable))))

(defn modify-cloud-to-device-config-callable
  "Modifies the configuration for the device, which is eventually sent from the Cloud IoT Core
   servers. Returns the modified configuration version and its metadata.

   Sample code:



   try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
     DeviceName name = DeviceName.of(\"[PROJECT]\", \"[LOCATION]\", \"[REGISTRY]\", \"[DEVICE]\");
     ByteString binaryData = ByteString.copyFromUtf8(\"\");
     ModifyCloudToDeviceConfigRequest request = ModifyCloudToDeviceConfigRequest.newBuilder()
       .setName(name.toString())
       .setBinaryData(binaryData)
       .build();
     ApiFuture<DeviceConfig> future = deviceManagerClient.modifyCloudToDeviceConfigCallable().futureCall(request);
     // Do something
     DeviceConfig response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.ModifyCloudToDeviceConfigRequest,com.google.cloud.iot.v1.DeviceConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DeviceManagerClient this]
    (-> this (.modifyCloudToDeviceConfigCallable))))

(defn create-device-registry-callable
  "Creates a device registry that contains devices.

   Sample code:



   try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     DeviceRegistry deviceRegistry = DeviceRegistry.newBuilder().build();
     CreateDeviceRegistryRequest request = CreateDeviceRegistryRequest.newBuilder()
       .setParent(parent.toString())
       .setDeviceRegistry(deviceRegistry)
       .build();
     ApiFuture<DeviceRegistry> future = deviceManagerClient.createDeviceRegistryCallable().futureCall(request);
     // Do something
     DeviceRegistry response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.CreateDeviceRegistryRequest,com.google.cloud.iot.v1.DeviceRegistry>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DeviceManagerClient this]
    (-> this (.createDeviceRegistryCallable))))

(defn update-device
  "Updates a device.

   Sample code:



   try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
     Device device = Device.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     Device response = deviceManagerClient.updateDevice(device, updateMask);
   }

  device - The new values for the device. The `id` and `num_id` fields must be empty, and the field `name` must specify the name path. For example, `projects/p0/locations/us-central1/registries/registry0/devices/device0`or `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`. - `com.google.cloud.iot.v1.Device`
  update-mask - Only updates the `device` fields indicated by this mask. The field mask must not be empty, and it must not contain fields that are immutable or only set by the server. Mutable top-level fields: `credentials`, `blocked`, and `metadata` - `com.google.protobuf.FieldMask`

  returns: `com.google.cloud.iot.v1.Device`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.iot.v1.Device [^DeviceManagerClient this ^com.google.cloud.iot.v1.Device device ^com.google.protobuf.FieldMask update-mask]
    (-> this (.updateDevice device update-mask)))
  (^com.google.cloud.iot.v1.Device [^DeviceManagerClient this ^com.google.cloud.iot.v1.UpdateDeviceRequest request]
    (-> this (.updateDevice request))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^DeviceManagerClient this]
    (-> this (.isTerminated))))

(defn create-device
  "Creates a device in a device registry.

   Sample code:



   try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
     RegistryName parent = RegistryName.of(\"[PROJECT]\", \"[LOCATION]\", \"[REGISTRY]\");
     Device device = Device.newBuilder().build();
     Device response = deviceManagerClient.createDevice(parent, device);
   }

  parent - The name of the device registry where this device should be created. For example, `projects/example-project/locations/us-central1/registries/my-registry`. - `com.google.cloud.iot.v1.RegistryName`
  device - The device registration details. The field `name` must be empty. The server generates `name` from the device registry `id` and the `parent` field. - `com.google.cloud.iot.v1.Device`

  returns: `com.google.cloud.iot.v1.Device`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.iot.v1.Device [^DeviceManagerClient this ^com.google.cloud.iot.v1.RegistryName parent ^com.google.cloud.iot.v1.Device device]
    (-> this (.createDevice parent device)))
  (^com.google.cloud.iot.v1.Device [^DeviceManagerClient this ^com.google.cloud.iot.v1.CreateDeviceRequest request]
    (-> this (.createDevice request))))

(defn delete-device-registry-callable
  "Deletes a device registry configuration.

   Sample code:



   try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
     RegistryName name = RegistryName.of(\"[PROJECT]\", \"[LOCATION]\", \"[REGISTRY]\");
     DeleteDeviceRegistryRequest request = DeleteDeviceRegistryRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = deviceManagerClient.deleteDeviceRegistryCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.DeleteDeviceRegistryRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DeviceManagerClient this]
    (-> this (.deleteDeviceRegistryCallable))))

(defn list-device-states
  "Lists the last few versions of the device state in descending order (i.e.: newest first).

   Sample code:



   try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
     DeviceName name = DeviceName.of(\"[PROJECT]\", \"[LOCATION]\", \"[REGISTRY]\", \"[DEVICE]\");
     ListDeviceStatesResponse response = deviceManagerClient.listDeviceStates(name);
   }

  name - The name of the device. For example, `projects/p0/locations/us-central1/registries/registry0/devices/device0` or `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`. - `com.google.cloud.iot.v1.DeviceName`

  returns: `com.google.cloud.iot.v1.ListDeviceStatesResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.iot.v1.ListDeviceStatesResponse [^DeviceManagerClient this ^com.google.cloud.iot.v1.DeviceName name]
    (-> this (.listDeviceStates name))))

(defn shutdown-now
  ""
  ([^DeviceManagerClient this]
    (-> this (.shutdownNow))))

(defn update-device-callable
  "Updates a device.

   Sample code:



   try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
     Device device = Device.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     UpdateDeviceRequest request = UpdateDeviceRequest.newBuilder()
       .setDevice(device)
       .setUpdateMask(updateMask)
       .build();
     ApiFuture<Device> future = deviceManagerClient.updateDeviceCallable().futureCall(request);
     // Do something
     Device response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iot.v1.UpdateDeviceRequest,com.google.cloud.iot.v1.Device>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DeviceManagerClient this]
    (-> this (.updateDeviceCallable))))

(defn test-iam-permissions
  "Returns permissions that a caller has on the specified resource. If the resource does not
   exist, this will return an empty set of permissions, not a NOT_FOUND error.

   Sample code:



   try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
     RegistryName resource = RegistryName.of(\"[PROJECT]\", \"[LOCATION]\", \"[REGISTRY]\");
     List<String> permissions = new ArrayList<>();
     TestIamPermissionsResponse response = deviceManagerClient.testIamPermissions(resource, permissions);
   }

  resource - REQUIRED: The resource for which the policy detail is being requested. See the operation documentation for the appropriate value for this field. - `com.google.cloud.iot.v1.RegistryName`
  permissions - The set of permissions to check for the `resource`. Permissions with wildcards (such as '*' or 'storage.*') are not allowed. For more information see [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions). - `java.util.List`

  returns: `com.google.iam.v1.TestIamPermissionsResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.iam.v1.TestIamPermissionsResponse [^DeviceManagerClient this ^com.google.cloud.iot.v1.RegistryName resource ^java.util.List permissions]
    (-> this (.testIamPermissions resource permissions)))
  (^com.google.iam.v1.TestIamPermissionsResponse [^DeviceManagerClient this ^com.google.iam.v1.TestIamPermissionsRequest request]
    (-> this (.testIamPermissions request))))

