# nbb-pulumi-eg
Trying to figure out how to get Pulumi and nbb to work together.
The main goal is to avoid compiling ClojureScript before running Pulumi.
Seems to mostly work. See issues section below.

## Install
* Install [Pulumi](https://www.pulumi.com/docs/get-started/install/)
* `npm install`

## Run
```shell
pulumi login --local
export PULUMI_CONFIG_PASSPHRASE=password
pulumi up
```

## Issues
* `extend-protocol` causes `nbb` to throw an error
  ```
  No protocol method IDeref.-deref defined for type null:

  ```
