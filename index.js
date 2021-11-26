"use strict";

async function main() {
  const nbb = await import('nbb');
  nbb.addClassPath('src');
  await nbb.loadFile('src/stack.cljs');
  return nbb.loadString("(stack/outputs)");
}

// See: https://github.com/pulumi/pulumi/pull/1866
module.exports = main();
