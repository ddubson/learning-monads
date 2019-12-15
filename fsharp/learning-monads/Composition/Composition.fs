module Composition

let f (a: string) = a + " world" 

let g (b: string) = b + "!!"

// https://fsharpforfunandprofit.com/posts/function-composition
let compositionExample () =
    printfn "--- Compose example ----"
    
    // Using the forward pipeline operator
    f "hello" |> g |> printfn "%s"
    // reads as:
    //     apply the result of (f "hello") to function g, the result of which is applied to function (printfn "%s")
    
    printfn "------------------------"