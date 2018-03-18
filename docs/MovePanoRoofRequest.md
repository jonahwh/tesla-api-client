
# MovePanoRoofRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**state** | [**StateEnum**](#StateEnum) | The desired state of the panoramic roof. The approximate percent open values for each state are &#x60;open&#x60; &#x3D; 100%, &#x60;close&#x60; &#x3D; 0%, &#x60;comfort&#x60; &#x3D; 80%, and &#x60;vent&#x60; &#x3D; ~15% |  [optional]
**percent** | **Double** | The percentage to move the roof to. |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
OPEN | &quot;open&quot;
CLOSE | &quot;close&quot;
COMFORT | &quot;comfort&quot;
VENT | &quot;vent&quot;
MOVE | &quot;move&quot;



